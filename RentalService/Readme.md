# Tp 1 Docker `evaldocker1`

Pour ce Tp je suis sur une machine Linux qui utilise [podman](https://podman.io/) (largement adapté pour linux)
Il est recommandé d'installer [Docker](https://www.docker.com/) si vous êtes sur windows !

## Créer l'image Docker

Créer l'image
```sh
podman build -t evaldocker1 .
```

Lancer l'image
```sh
podman run -d -p 8080:8080 evaldocker1
```

## Tester l'image
Ouvrez votre naviguateur sur la page
`localhost:8080/bonjour`

Si vous voyez ce message :
`bonjour`

C'est que votre Image est bien lancée !


## Publier l'image sur Docker
Créer le tag
```sh
podman tag evaldocker1 docker.io/mathdocs/tpdocker1:v1
```

Publier sur Docker.io
```sh
podman push docker.io/mathdocs/tpdocker1:v1
```
