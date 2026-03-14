# Lift Operation 🚇

A simple Java program that simulates a lift (elevator) system. It handles floor requests, moves between floors step by step, and enforces a maximum capacity of 6 persons.

## How It Works
1. The program starts at the ground floor (0).
2. Users enter the number of persons inside the lift.
   - If more than 6, the program asks extra persons to wait.
3. Each person can request a floor between 0–5.
4. The lift moves floor by floor until the requested floor is reached.
5. If the requested floor is invalid, the program notifies the user.

## Features
- Floor navigation (up and down)
- Capacity check (max 6 persons)
- Handles multiple requests sequentially
- Simple console-based interaction

## Future Improvements
- Track total trips and floors traveled
- Add door open/close simulation
- Display lift movement visually
