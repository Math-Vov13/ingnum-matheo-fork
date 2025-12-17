# Tp 1 Docker `evaldocker1`

## Créer l'image Docker

Créer l'image
```sh
podman build -t evaldocker1 .
```

Lancer l'image
```sh
podman run -d -p 8080:8080 evaldocker1
```

## Publier sur Docker
Créer le tag
```sh
podman tag evaldocker1 docker.io/mathdocs/tpdocker1:v1
```

Publier sur Docker.io
```sh
podman push docker.io/mathdocs/tpdocker1:v1
```
