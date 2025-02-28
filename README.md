# Dungeon Builder Project

## Overview
This project implements a dungeon-building system using the **Builder** design pattern. The program allows users to create a dungeon with various elements such as rooms, NPCs, traps, treasures, and secret passages.

## Features
- **Builder Pattern**: Used to construct a complex Dungeon object step by step.
- **Encapsulation**: Each entity (e.g., Room, NPC, Trap) is represented as a separate class.
- **Modular Design**: The system can be extended easily by adding new types of objects.

## Classes and Responsibilities
```
- **`Dungeon`**: Represents the dungeon containing rooms, NPCs, traps, treasures, and secret passages.
- **`Room`**: Represents a room inside the dungeon.
- **`NPC`**: Represents non-player characters in the dungeon.
- **`Trap`**: Represents traps inside the dungeon.
- **`Treasure`**: Represents treasures hidden inside the dungeon.
- **`SecretPassage`**: Represents hidden pathways inside the dungeon.
- **`IDungeonBuilder`**: Defines the builder interface for creating a dungeon.
- **`SimpleDungeonBuilder`**: Implements `IDungeonBuilder` to build a `Dungeon` step by step.
- **`MUDBuilderDemo`**: The main class demonstrating the usage of the Builder Pattern to create and display a dungeon.
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



