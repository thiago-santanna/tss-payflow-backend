package com.tsswebapps.payflow.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "perfil")
@SequenceGenerator(name = "seq_perfil", sequenceName = "seq_perfil", allocationSize = 1, initialValue = 1)
public class Perfil implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_perfil")
    private Long id;

    private String descricao;

    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return this.descricao;
    }

    @Column(nullable = false, length = 80)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perfil other = (Perfil) obj;
        return Objects.equals(id, other.id);
    }
}
