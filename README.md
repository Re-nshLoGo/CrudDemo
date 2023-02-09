## User Management System
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run User Management System 
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/
 * Type endpoints in url
 
 
#### In this User management system
The user will have the following attribute
 * UserId
 * Name
 * UserName
 * Address
 * Phone Number
 
 User will perform following operations - 
 ##### 1) - Add User Info -
 In AddUser functionality we Post User info through Postman and it gets added to the User list - 
 ##### -> Add User EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/ums/addUser
 
 ![adduserinfo](https://user-images.githubusercontent.com/117101699/217189870-139e0f2d-c3fb-413a-b5c3-abaeb1383b4e.png)
 
 ##### 2) - Get a User Info by UserId -
 In this functionality we provide a perticular User info by sending the userid in url through @Pathvariable - 
  ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/ums/getUser/{userId}
 
 
 ![getuserByid](https://user-images.githubusercontent.com/117101699/217192041-5424e45a-114e-4b97-a0eb-be7eaffb55d3.png)
 
 ##### 3) - Get all User Info -
 This functionality provides all User info list - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/ums/getAllUser
 
 
![getAlluser](https://user-images.githubusercontent.com/117101699/217192788-124cd954-8f96-4288-ac58-af8616d2bad0.png)
 
 ##### 4) - Update User Info by UserId-
 This functionality Updates a perticular User info through Postman by sending userid in url - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/ums/updateUserinfo/id/{userId}
 
 
 ![updateuserbyid](https://user-images.githubusercontent.com/117101699/217193874-cc9ae274-5cd8-4c8b-ae7d-3a11f59dab03.png)

 ##### 5) - Delete User Info by UserId-
 This functionality deletes particular User info through Postman using the Delete method by sending the user-id in URL-
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - api/ums/deleteUser/id/{userId}
 
 
 ![deletebyid](https://user-images.githubusercontent.com/117101699/217194417-2f3679e4-d015-4a56-af08-66660395d49c.png)

### Note
* You can change server port by setting properties in application.properties file i.e.

        server.port=8081
 
 
