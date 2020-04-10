package org.darklance.lancewebservice.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.darklance.lancewebservice.entity.Connection;

@Mapper
public interface ConnectionMapper {

	public List<Connection> selectAllConnections();
}
