package gic.dao;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gic.dto.RoomDto;
import gic.mapper.SearchRoomMapper;

@Repository
public class SearchRoomDao {

	@Autowired
	SearchRoomMapper roomMapper;
	
	public List<RoomDto> getRoomList() {
		return roomMapper.getRoomList();
	}

	public void saveRoom(@Valid RoomDto room) {
		roomMapper.saveRoom(room);
		
	}

	public RoomDto getRoomWithId(String roomId) {
		
		return roomMapper.getRoomWithId(roomId);
	}

	public void updateUser(RoomDto roomDto) {
		roomMapper.updateUser(roomDto);
	}

	public void deleteRoom(String roomId) {
		roomMapper.deleteRoom(roomId);
		
	}

}
