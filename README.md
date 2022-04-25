# E-commerceWebApp-BackEnd
Built with Spring Boot

## Introduction

- It is a demo application for developing a fully functional E-commerce website.
- The website allows users to see all items, read description of those items, add those items into cart, and checkout the cart.
- The website allows users to register their own account and track their orders with Okta API
- The website allows users to pay with their credit card and recieve an email receipt with Stripe API
- During checkout, users are able to easily select country and state, and copy their address to billing address if they are the same.

## Demo data

**Please enter these [Query](https://github.com/shhhawn9/E-commerceWebApp-BackEnd/tree/master/SQL-mockup) to MySQL in order to see the full demo.**

## Run Application

Simply run the backend with any compiler. The CRUD API can be accessed through `http://localhost:8443/api/...` through Postman or whatever API testing application you are using. Be aware, POST, PUT, and DELETE for items are forbidden. GET any order history that doesn't belong to your account is also forbidden.
