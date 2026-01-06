<?php

namespace App\Controller;

use App\Repository\CustomerRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class CustomerController extends AbstractController
{
    public function __construct(private readonly CustomerRepository $customerRepository)
    {
    }

    #[Route('/api/customers', name: 'api_customers', methods: ['GET'])]
    public function listCustomers(): JsonResponse
    {
        return $this->json($this->customerRepository->findAll());
    }

    #[Route('/api/customers/{name}/address', name: 'customer_address', methods: ['GET'])]
    public function getCustomerAddress(string $name): JsonResponse
    {
        $customer = $this->customerRepository->findOneByName($name);

        if (!$customer) {
            return new JsonResponse('Customer not found', Response::HTTP_NOT_FOUND);
        }

        return new JsonResponse($customer->getAddress());
    }
}
