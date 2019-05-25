package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {
  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;
}
