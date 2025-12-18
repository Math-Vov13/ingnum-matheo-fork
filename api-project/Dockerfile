FROM php:8.2-cli

# Installer extensions PHP nécessaires
RUN apt-get update && apt-get install -y git unzip libzip-dev \
    && docker-php-ext-install pdo pdo_mysql

# Installer Composer
COPY --from=composer:2 /usr/bin/composer /usr/bin/composer

WORKDIR /app

# Copier et installer les dépendances sans scripts post-install
COPY composer.json composer.lock ./
RUN composer install --no-dev --optimize-autoloader --no-scripts

COPY . .

EXPOSE 8000
CMD ["php", "-S", "0.0.0.0:8000", "-t", "public"]
