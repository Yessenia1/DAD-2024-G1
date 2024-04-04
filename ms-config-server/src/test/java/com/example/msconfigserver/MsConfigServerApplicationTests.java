package com.example.msconfigserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MsConfigServerApplicationTests {

	@Test
	void contextLoads() {
	}

}

server:
port: 7070




spring:
application:
name: config-server
cloud:
config:
server:
git:
uri: https://github.com/noetipo/DAD-2024-G1.git # ruta del repositorio git
searchPaths: config-data
default-label: main
