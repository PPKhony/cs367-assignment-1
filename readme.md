# Assignment 1

## Problem Statement

When we purchase items, we need to store them in a specific location and remember where they are stored. When these items are used by us or others, we need to keep track of where they were taken and who used them (if known). In case someone borrows an item and returns it, we should know that it has been returned and where it is stored again. 

If we need to remember, record, and track these details manually, it might be cumbersome. Therefore, we need a system to manage this process efficiently.

## Objective

Create a system that:
1. Records the storage location of purchased items.
2. Tracks the usage of items, including who used them and where they were taken.
3. Logs the return of borrowed items and updates their storage location.

This system should simplify the process of managing and tracking items, reducing the need for manual effort.

## Sample path
### API Endpoints

#### Get all tools
```
GET http://localhost:8080/handytools
```

#### Get tool by ID
```
GET http://localhost:8080/handytools/25
```

#### Create a new tool
```
POST http://localhost:8080/handytools
Content-Type: application/json
Sample Body
{
    "name": "Hammer",
    "category": "Hand Tools",
    "owner": "John Doe",
    "condition": "New",
    "availability": true,
    "lastUsedDate": "2023-10-01",
    "location": "Garage",
    "specifications": "16 oz",
    "notes": "None"
}
```

#### Update an existing tool
```
PUT http://localhost:8080/handytools/9
Content-Type: application/json
Sample Body
{
    "name": "Hammer",
    "category": "Hand Tools",
    "owner": "Jane Doe",
    "condition": "Used",
    "availability": false,
    "lastUsedDate": "2023-10-10",
    "location": "Workshop",
    "specifications": "16 oz",
    "notes": "Handle slightly worn"
}
```

#### Delete a tool
```
DELETE http://localhost:8080/handytools/25
```