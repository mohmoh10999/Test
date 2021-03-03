package gic.mapper;

import java.util.List;

import javax.validation.Valid;

import org.apache.ibatis.annotations.Mapper;

import gic.dto.RoomDto;

@Mapper
public interface SearchRoomMapper {

	List<RoomDto> getRoomList();

	void saveRoom(@Valid RoomDto room);

	RoomDto getRoomWithId(String roomId);

	void updateUser(RoomDto roomDto);

	void deleteRoom(String roomId);

}
