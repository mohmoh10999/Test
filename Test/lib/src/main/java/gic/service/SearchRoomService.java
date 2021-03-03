package gic.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gic.dao.SearchRoomDao;
import gic.dto.RoomDto;

@Service
public class SearchRoomService  {

	@Autowired 
	SearchRoomDao roomDao;
	
	public List<RoomDto> getRoomList() {
		return roomDao.getRoomList();
	}

	public void saveRoom(@Valid RoomDto room) {
		roomDao.saveRoom(room);
		
	}

	public RoomDto getRoomWithId(String roomId) {
		return roomDao.getRoomWithId(roomId);
	}

	public void updateUser(RoomDto roomDto) {
		roomDao.updateUser(roomDto);
	}

	public void deleteRoom(String roomId) {
		roomDao.deleteRoom(roomId);
	}

}
