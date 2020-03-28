import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            logic(em);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }

    private static void logic(EntityManager em) {
        Member member = new Member();
        String id = "id1";
        member.setId(id);
        member.setUsername("무곤");
        member.setPassword("12");

        em.persist(member);

        Member findMember = em.find(Member.class, id);
        System.out.println(findMember.getUsername() + ", " + findMember.getPassword());

//        em.createQuery("select m from MEMBER m")
    }
}
