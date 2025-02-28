# homework3.ShP

# Dungeon Builder Project

## Overview
This project implements a dungeon-building system using the **Builder** and **Prototype** design patterns. The program allows users to create a dungeon with various elements such as rooms, NPCs, traps, treasures, and secret passages.

## Features
- **Builder Pattern**: Used to construct a complex `Dungeon` object step by step.
- **Encapsulation**: Each entity (e.g., `Room`, `NPC`, `Trap`) is represented as a separate class.
- **Modular Design**: The system can be extended easily by adding new types of objects.

## Project Structure
```
HW2.SHP/
│── src/
│   ├── Dungeon.java           # Represents the dungeon
│   ├── IDungeonBuilder.java   # Interface for the builder pattern
│   ├── SimpleDungeonBuilder.java  # Implements the builder interface
│   ├── MUDBuilderDemo.java    # Main class for demonstration
│   ├── Room.java              # Represents a room in the dungeon
│   ├── NPC.java               # Represents a non-playable character
│   ├── Trap.java              # Represents a trap in the dungeon
│   ├── Treasure.java          # Represents a treasure
│   ├── SecretPassage.java     # Represents a hidden passage
│
└── README.md                  # Documentation
```

## How to Run
1. Clone or download the project.
2. Open the project in **IntelliJ IDEA** (or any Java-compatible IDE).
3. Ensure the project uses Java 8 or later.
4. Compile and run `MUDBuilderDemo.java`.
5. The console will display the dungeon's details.

## Example Output
```
Dungeon: Dark Caverns

Rooms:
- Entrance Hall
- Treasure Room
- Boss Chamber

NPCs:
- Goblin Guard
- Fire Dragon

Traps:
- Poison Arrows
- Fire Pit

Treasures:
- Golden Chest
- Ring of Power

Secret Passages:
- Hidden Door behind the Statue
- Underground Tunnel to Escape
```

## Design Patterns Used
### 1. Builder Pattern
The `SimpleDungeonBuilder` class follows the **Builder** pattern to construct a `Dungeon` step by step.
```java
Dungeon dungeon = new SimpleDungeonBuilder()
        .setDungeonName("Dark Caverns")
        .addRoom(room1)
        .addRoom(room2)
        .build();
```
This allows for flexible and readable object creation.

### 2. Prototype Pattern (Optional Extension)
If required, objects like `Room` or `NPC` can implement `Cloneable` to enable deep copying.

## Author
- **Your Name Here**

## License
This project is for educational purposes only.

