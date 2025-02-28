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
- src/
Dungeon.java           # Represents the dungeon
IDungeonBuilder.java   # Interface for the builder pattern
SimpleDungeonBuilder.java  # Implements the builder interface
MUDBuilderDemo.java    # Main class for demonstration
Room.java              # Represents a room in the dungeon
NPC.java               # Represents a non-playable character
Trap.java              # Represents a trap in the dungeon
Treasure.java          # Represents a treasure
SecretPassage.java     # Represents a hidden passage
```

## Output
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

## Author
- **Temirkhan Saniya**



