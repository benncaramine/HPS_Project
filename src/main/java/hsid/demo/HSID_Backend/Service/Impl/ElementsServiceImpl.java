package hsid.demo.HSID_Backend.Service.Impl;

import hsid.demo.HSID_Backend.Service.ElementsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ElementsServiceImpl implements ElementsService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<Integer, String> getSpecificAttribute(String attribute) {
        String sql = "SELECT elementnumber, attribute, description, " + attribute + " FROM elements WHERE " + attribute + " IS NOT NULL";
        return jdbcTemplate.query(sql, rs -> {
            Map<Integer, String> attributes = new HashMap<>();
            while (rs.next()) {
                attributes.put(rs.getInt("elementnumber"), rs.getString(attribute));
            }
            return attributes;
        });
    }
}