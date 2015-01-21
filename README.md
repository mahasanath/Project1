## CSC 792- DevOps
---------------

### Homework - 1
------------

#### I.) Creating an account:
------------------------
An account with Amazon Web Services (AWS) was created wit the following email ID:    
email: smahala@ncsu.edu  
The following sections demostrate proof that an account was created (as seen in the screenshots)  
  
#### II.) Description of an AWS Service  
----------------------------------

Compute and Networking : EC2 and Auto Scaling
Elastic compute cloud orEC2 , as it is popularly known helps host virual serversin the cloud thereby providing scalable compute capacity to its users. One of the key aspects about this web service is that it is configurable and resizable. It provides users the complete contro of their computing envionment.
What makes EC2 very desirable to most clouduses is that you payonly for what you use and scale as per need. It largely reduces the time to boot new server instances.
Ec2 provides seamless global services to its customers using Auto scaling and ELB , the load balancing service. EC2 provides different types of Instances like Spot, Reserved, On-Demand that enable bidding on unused instances and instances at discounted prices. EC2 provides control over geographical regions thereby providing latency optimization.
Auto Scaling helps to increase or decrease the compute capacity of the EC2 instances according to pre defined conditions. This is specially useful during demand spikes and to rduce costs during lulls.
  
  
#### III.) Authenticate to Service  
-----------------------------
Authentication was done using two credentials: a.) Access Key ID b.) Secret Access Key (these are stored in credentials.properties file in the .aws folder)  
These two entities were used in "ProfileCredentialsProvider" API Call in the JAVA SDK (which uses the getCredentials() method call)
It fetches the credentials which are stored in Eclipse under the AWS Took Kit preferences and access the AWS Console with these credentials.

#### IV.) Description of API Call (Amazon EC2 Instance creation and termination)
---------------------------  
The description of the program is as follows:  

The purpose of the program is to demonstrate:  
1.) Authentication to service  
2.) Creation and termination of EC2 instances.  
Authentication to Service is done as told in section III. Once authentication is done, a new instance is created and run using the RunInstancesRequest API Call. Parameters such as
ImageID, Instance Type, Security-Group and Key Pair are given along with the API Call. Looking at the AWS console will let the user know that an instance has now been created and is currently runnning.  
<Screenshot of Instance Running Output>  
(A delay of one minute has been added so as to enable taking screenshot of the running instance.)  
Finally, the running instance is terminated using the TerminateInstancesRequest API Call(with the "terminateInstances" method) which will terminate all running / pending instances.
<Screenshot of terminated instances>. 
