package dev.alfrendosilalahi.talentive.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userTypeId;

    private String userTypeName;

}
