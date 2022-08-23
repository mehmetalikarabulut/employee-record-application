#Employee Record Application

Written a service that holds employee records. It hold employment details, payroll and their personal information.

The service have rest endpoints to run crud functions (Create, List, Update, Delete).

The task include apart from crud endpoints following endpoints:
1.	An endpoint that returns all the employees that started after a specific date and their income is greater than specific amount.
2.	An endpoint that updates the office location of all the employees of a specific department.
3.	A service method that returns a random employee for a monthly prize draw every month at a specific time and saves it to the database. With an endpoint to call the winner every month.

Used in memory database in the project :  localhost:8090/h2-console

Database tables are given below.

Emloyees table:

![employees](https://user-images.githubusercontent.com/82678940/186190975-e7621346-dbe8-41ec-bbd6-e6e54e05bbd6.png)

Locations table:

![locations](https://user-images.githubusercontent.com/82678940/186191213-6e4a455c-bdc7-4703-be65-c0b2e9584344.png)

Random winners table:

![winners](https://user-images.githubusercontent.com/82678940/186191278-9d1d0c6e-a03e-4dc8-a7d8-0c01498f50fd.png)

Postman outputs are given below.

Output of save locations method:

![saveLocation](https://user-images.githubusercontent.com/82678940/186191897-bd64f139-5cdf-4c21-aee6-da38f57d631d.png)

Output of update locations method:

![updateLocation](https://user-images.githubusercontent.com/82678940/186192855-4b0e4606-bdf4-4527-92c6-be41cd11e7b2.png)

Output of save employees method:

![saveEmployee](https://user-images.githubusercontent.com/82678940/186192060-ea040552-407b-476e-be69-f423d6572ee2.png)

Output of list employees method:

![employeeList](https://user-images.githubusercontent.com/82678940/186192236-c93e6572-bb56-46f7-a074-1c6bf8d22865.png)

Output of update employees method:

![employeeUpdate](https://user-images.githubusercontent.com/82678940/186192602-5de7e157-fcd1-4503-9874-1862b9bb50df.png)

Output of delete employees method:

![employeeDelete](https://user-images.githubusercontent.com/82678940/186193067-ef04a3db-604d-40b0-a666-8ef5e702ede1.png)

Output of search by employees incomes and job start dates method:

![searchIncomeAndDate](https://user-images.githubusercontent.com/82678940/186193425-885ccb78-cc8a-4f59-83d2-79aa9c91e9e0.png)

Output of random employee determination method:

![randomWinner](https://user-images.githubusercontent.com/82678940/186193659-2b45589d-4d7e-43bd-9392-0832d8dcb6e3.png)







