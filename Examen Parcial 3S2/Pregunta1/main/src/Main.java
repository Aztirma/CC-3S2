import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> miembros = List.of(
                new PremiumMember("Abejita Azul"),
                new VipMember("Kaperucita Feliz"),
                new FreeMember("Inspectora Motita")
        );

        for (Member miembro : miembros) {
            miembro.joinTournament();
            miembro.organizeTournament();
            System.out.println();
        }
    }

    public static abstract class Member {
        private final String nombre;

        public Member(String nombre) {
            this.nombre = nombre;
        }

        public abstract void joinTournament();
        public abstract void organizeTournament();
    }

    public static class PremiumMember extends Member {
        public PremiumMember(String nombre) {
            super(nombre);
        }

        @Override
        public void joinTournament() {
            System.out.println("Unirse al torneo como miembro premium");
        }

        @Override
        public void organizeTournament() {
            System.out.println("Organizar torneo como miembro premium");
        }
    }

    public static class VipMember extends Member {
        public VipMember(String nombre) {
            super(nombre);
        }

        @Override
        public void joinTournament() {
            System.out.println("Unirse al torneo como miembro VIP");
        }

        @Override
        public void organizeTournament() {
            System.out.println("Organizar torneo como miembro VIP");
        }
    }

    public static class FreeMember extends Member {
        public FreeMember(String nombre) {
            super(nombre);
        }

        @Override
        public void joinTournament() {
            System.out.println("Unirse al torneo como miembro gratuito");
        }

        @Override
        public void organizeTournament() {
            throw new UnsupportedOperationException("Los miembros gratuitos no pueden organizar torneos");
        }
    }
}
