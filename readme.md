# Assignment 1: Urban Explorer Tools Management System

## Project Overview

### Situation
- Urban exploration equipment management system requires organization and tracking
- Need to implement a RESTful service to handle equipment lending and status updates
- Multiple types of equipment need to be managed across various categories

### Task
- Develop a RESTful API for equipment management
- Implement CRUD operations for tools inventory
- Create state management system for equipment status
- Design endpoints for equipment borrowing and returns
- Build testing framework using `.rest` files


### Result
- Complete RESTful web service for equipment management
- Organized system for tracking urban exploration tools
- Efficient borrowing and return process
- Maintainable codebase with proper documentation
- Comprehensive test coverage for all operations

**Deadline**: 12:00 AM Sunday, February 16, 2025

## Project Specifications

### Equipment Categories
- Navigation Tools (GPS, Compasses)
- Safety Equipment (First Aid Kits, Flashlights)
- Documentation Tools (Cameras, Voice Recorders)
- Access Equipment (Ropes, Harnesses)

### Required REST Endpoints

#### GET Operations
- `GET /tools` - List all urban exploration tools
- `GET /tools/{id}` - Get specific tool details

#### POST Operations
- `POST /tools` - Register new equipment


#### PUT Operations
- `PUT /tools/{id}` - Update tool status/location


#### DELETE Operations
- `DELETE /tools/{id}` - Remove tool from inventory

### State Management
Tools can have the following states:
- Available
- Borrowed
- Maintenance
- Lost

## Testing Requirements
Include `.rest` file with test cases for:
- Adding new equipment
- Updating equipment status
- Checking equipment location
- Removing equipment
- Borrowing and returning process

## Submission Guidelines
- Submit zipped project code
- Include all implementation files
- Include `.rest` test file
- Document any assumptions made
