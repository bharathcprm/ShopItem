1. mvn clean install
		-> Clean the project and dowload the dependency from pom.xml file and build the project
2. Run the Application from Eclipse or STS(Spring Tool Suite)

3. Endpoint to create one item:
		
		Request Url:
		
		http://localhost:9001/item/create
		
		Request Body :
		
		{
		"itemId":101,
		"itemName":"Apple"
		}
		
		Response : 
		
		Item Created Successfully : Apple
		
4. Endpoint to delete an item:

		Request Url:
		
		http://localhost:9001/item/delete/3
		
		Response :
		
		Item Deleted Successfully : 3
		
5. Endpoint to update an item:
	
		Request Url:
		
		http://localhost:9001/item/update
		
		Request Body:
		
		{
		"itemId":101,
		"name":"orange"
		}
		
		Response :
		
		Item updated Successfully : orange
		
6. Endpoint to fetch an item by id, name

		Request Url:
		
		http://localhost:9001/item/1/apple
		
		Response :
		
		[
		{
		"itemId": 1,
		"itemName": "apple"
		}
		]
		
7. Endpoint to fetch all items

		Request Url : 
		
		http://localhost:9001/items
		
		Response : 
		
		[
		{
			"itemId": 1,
			"itemName": "apple"
		},
		{
			"itemId": 2,
			"itemName": "orange"
		},
		{
			"itemId": 3,
			"itemName": "graps"
		}
		]
		
8. Swager Url :
	
		http://localhost:9001/swagger-ui/index.html
		
9. JWT token Authentication

		Request Url:
		
		http://localhost:9001/authenticate
		
		Request Body :
		
		{
		"userName":"user1",
		"password":"password"
		}
		
		Response : 
		
		eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY4NDQ2MjMxOCwiaWF0IjoxNjg0NDI2MzE4fQ.URYO0hNDrGoQcEwE6QlHqI4DTKghx6ujFQGpXe0ncJo
		
		Request Url to access rest API :
		
		http://localhost:9001/
		
		Request header :
		
		Authorization - Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY4NDQ2MjMxOCwiaWF0IjoxNjg0NDI2MzE4fQ.URYO0hNDrGoQcEwE6QlHqI4DTKghx6ujFQGpXe0ncJo
		

