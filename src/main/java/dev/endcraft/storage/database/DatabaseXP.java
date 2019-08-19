package dev.endcraft.storage.database;

import java.util.List;

import dev.endcraft.storage.chest.ChestSerializable;

public interface DatabaseXP {

	void update(Integer userId, ChestSerializable chest);
	
	void insert(Integer userId, ChestSerializable chest);
	
	List<ChestSerializable> findChestByUserId(Integer userId);
	
	ChestSerializable findChestById(Integer chestId);
	
	void removeChestByUserId(Integer chestId);
}
