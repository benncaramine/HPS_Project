package hsid.demo.HSID_Backend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Element_Values")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ElementValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer elementnumber;

    String position;

    String description_p;

    String code;

    String description_c;

    String in_message;

    String service;

    String servcice_code;

}