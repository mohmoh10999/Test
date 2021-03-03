package gic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gic.dto.House;
import gic.dto.RoomDto;
import gic.service.SearchRoomService;

@RestController
public class SearchRoomController {

	@Autowired
	SearchRoomService roomService;
	List<RoomDto> roomList;

	@GetMapping("/getRoomList")
	public List<RoomDto> getRoomList() {
		roomList = roomService.getRoomList();
		System.out.println(roomList.size());
		return roomList;
	}

	@PostMapping("/saveRoom")
	public List<RoomDto> createRoom(@Valid @RequestBody RoomDto room) {
		roomService.saveRoom(room);
		return roomService.getRoomList();
	}

	@PutMapping("updateRoom/{roomId}")
	public RoomDto updateRoom(@PathVariable(value = "roomId") String roomId,
			@Valid @RequestBody RoomDto room) {
		
		RoomDto roomDto = roomService.getRoomWithId(roomId);
		roomDto.setType(room.getType());
		roomService.updateUser(roomDto);
		return roomDto;
	}

	@DeleteMapping("deleteRooms/{roomId}")
	public List<RoomDto> deleteRoom(@PathVariable(value = "roomId") String roomId) {
		roomService.deleteRoom(roomId);
		return roomService.getRoomList();
	}
}
