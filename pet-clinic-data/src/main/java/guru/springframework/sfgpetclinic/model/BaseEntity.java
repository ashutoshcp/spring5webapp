package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class BaseEntity implements Serializable {

  private Long id;
}
