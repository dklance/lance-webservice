package org.darklance.lancewebservice;

import java.util.List;

import org.darklance.lancewebservice.entity.Connection;
import org.darklance.lancewebservice.mappers.ConnectionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LanceWebserviceApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(LanceWebserviceApplication.class);
	
	@Autowired
	private ConnectionMapper connectionMapper;
	
	public static void main(String[] args) {
		SpringApplication.run(LanceWebserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Pulling Info From DB");
		List<Connection> connections = connectionMapper.selectAllConnections();
		connections.stream().map(Connection::toString).forEach(LOGGER::info);
		LOGGER.info("Done");
		
	}

}
