# RAM - equipment rental app

Web application for renting equipment for occasional parties.

## Table of Contents

* [Introduction](#Introduction)
* [Technologies](#Technologies)
* [Setup](#Setup)
* [Features](#Features)
* [Important info](#Important info)

## Introduction

This project was created by me and three others.
The aim of this project was to learn web application
development in java spring. My task in this project
was to create a backend part of the inventory and
add and delete photos. Inventory is all information
about the equipment that can be found on the website
and all contact details of its owner.

## Technologies

- Java 17
- spring
- css 3
- html 5
- Postgre SQL
- JavaScript
- React.js
- Maven

## Setup

- One of the ways to run the backend part
of the application is to run the project's
repository in the ide type of the Krzsztof or other type.
Then find the application.propreties file and enter your
postgresql database data there. The file is located on
the path: src / main / resouces.
- Then enter the EventApplication.java 
file located:
src / main / java and run it.
- to run the visual part of the application,
go to the link leading to the expensive
repository and read the readme file to
run this part of the application
- link to front repository https://github.com/Arutorek/R.A.M-front

## Important info

### Logining to application
User registration is not possible because the accounts are to be created by the owner of the application and the user gets login and password after signing the contract with the owner.
For the purposes of the presentation, four accounts with different permissions have been prepared.
the password for each account is 123
logins: admin, user, guest, hirek

### Other info

We were unable to finish the application from the frontend side, so not all functionalities are currently working.
The functions that should work at the moment are:
- Login
- Dashboard tab
- Equipment tab
- User roles tab
- Application user tab
- Equipment categories tab
- Equipment statuses tab
- Equipment ownership types tab
- Equipment booking statuses tab

## Features

- Login and Register
- The division of roles into administration and users
- Adding equipment for rent
- Description of the equipment and owner details
- Uploading photos
