package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //Conexão com o banco
        EntityManager em = emf.createEntityManager(); //Criação da entidade

     /* Pessoa p1 = new Pessoa(null,"Carlos silva","carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"Roberto silva","roberto@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana silva","ana@gmail.com");*/


        /*em.getTransaction().begin(); // Iniciar operações com o banco

        //Inserir no banco
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit(); // Confirmar alterações*/

        Pessoa p = em.find(Pessoa.class, 2);

        System.out.println(p.getNome());
        System.out.println("Pronto");

        em.close();
        emf.close();

    }
}
