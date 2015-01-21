# Project1
Test Project

CSC 792- DevOps
---------------

Homework - 1
------------

I.) Creating an account:
------------------------
An account with Amazon Web Services (AWS) was created wit the following email ID:    
email: smahala@ncsu.edu  
The following sections demostrate proof that an account was created (as seen in the screenshots)  
  
II.) Description of an AWS Service  
----------------------------------
  
  
III.) Authenticate to Service  
-----------------------------
Authentication was done using two credentials: a.) Access Key ID b.) Secret Access Key (these are stored in credentials.properties file in the .aws folder)  
These two entities were used in "ProfileCredentialsProvider" API Call in the JAVA SDK (which uses the getCredentials() method call)
It fetches the credentials which are stored in Eclipse under the AWS Took Kit preferences and access the AWS Console with these credentials.

IV.) Description of API Call (Amazon EC2 Instance creation and termination)
---------------------------  
The description of the program is as follows:  

The purpose of the program is to demonstrate:  
1.) Authentication to service  
2.) Creation, running and termination of EC2 instances.  
Authentication to Service is done as told in section III. Once authentication is done, a new instance is created and run using the RunInstancesRequest API Call. Parameters such as
ImageID, Instance Type, Security-Group and Key Pair are given along with the API Call. Looking at the AWS console will let the user know that an instance has now been created and is currently runnning.  
<Screenshot of Instance Running Output>  
(A delay of one minute has been added so as to enable taking screenshot of the running instance.)  
Finally, the running instance is terminated using the TerminateInstancesRequest API Call(with the "terminateInstances" method) which will terminate all running / pending instances.
<Screenshot of terminated instances>. 
