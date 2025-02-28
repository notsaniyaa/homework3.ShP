public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(Trap trap);
    IDungeonBuilder addTreasure(Treasure treasure);
    IDungeonBuilder addSecretPassage(SecretPassage secretPassage);
    Dungeon build();
}
