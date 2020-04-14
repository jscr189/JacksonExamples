package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto dto=getDto();
        String jsonStr=objectMapper.writeValueAsString(dto);
        System.out.println(jsonStr);
    }

    @Test
    void testDeserialize() throws IOException {
        String serializedStr="{\"Beer Id\":\"0dacbd82-f264-4333-85ba-0b7e13a2c86d\",\"beerName\":\"Abc\",\"beerStyle\":\"Ale\",\"upc\":1251271281291212001,\"price\":12.99,\"createdDate\":\"2020-04-15T03:46:22.3289435+05:30\",\"lastUpdatedDate\":\"2020-04-15T03:46:22.3289435+05:30\"}";
        BeerDto dto=objectMapper.readValue(serializedStr,BeerDto.class);
        System.out.println(dto.toString());
    }

}