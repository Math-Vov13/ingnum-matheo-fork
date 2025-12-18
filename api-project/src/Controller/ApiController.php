<?php

namespace App\Controller;

use Symfony\Component\HttpFoundation\JsonResponse;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;

class ApiController extends AbstractController
{
    #[Route('/api/ping', name: 'api_ping', methods: ['GET'])]
    public function ping(): JsonResponse
    {
        return $this->json([
            'status' => 'ok',
            'message' => 'API Symfony 5.4 – PHP 8.0'
        ]);
    }

    #[Route('/api/name', name: 'api_name', methods: ['GET'])]
    public function name(): JsonResponse
    {
        return $this->json([
            'status' => 'ok',
            'message' => 'Hello, World!'
        ]);
    }
}
