
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {

    DefaultMutableTreeNode nodoSeleccionado;
    String HeroeSeleccionado;
    String VillanoSeleccionado;
    Villanos tVillanos;
    Heroes tHeroes;
    EscuadronHeroe tEscHeroe;
    EscuadronVillano tEscVillano;
    ArrayList<EscuadronHeroe> escuadron_heroes = new ArrayList();
    ArrayList<EscuadronVillano> escuadron_villanos = new ArrayList();

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_heroes = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        txtHeroeNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinHeroeFuerza = new javax.swing.JSpinner();
        spinHeroeAfisica = new javax.swing.JSpinner();
        spinHeroeAmental = new javax.swing.JSpinner();
        btAgregarHeroe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlHeroes = new javax.swing.JList<>();
        bHeroeModificar = new javax.swing.JButton();
        btnHeroeModificar = new javax.swing.JButton();
        bHeroeEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtHeroePoder = new javax.swing.JTextField();
        txtHeroeDebilidad = new javax.swing.JTextField();
        jd_villanos = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVillanoNombre = new javax.swing.JTextField();
        spinVillanoFuerza = new javax.swing.JSpinner();
        spinVillanoAfisica = new javax.swing.JSpinner();
        spinVillanoAmental = new javax.swing.JSpinner();
        btAgregarVillano = new javax.swing.JButton();
        bVillanoModificar = new javax.swing.JButton();
        btnVillanoModificar = new javax.swing.JButton();
        bVillanoEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlVillanos = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        txtVillanoPoder = new javax.swing.JTextField();
        txtVillanoDebilidad = new javax.swing.JTextField();
        jd_escuadronH = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tf_nombre_es_he = new javax.swing.JTextField();
        tf_localidad_es_he = new javax.swing.JTextField();
        tf_lema_es_he = new javax.swing.JTextField();
        cb_heroes = new javax.swing.JComboBox<>();
        tf_tipo_es_he = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_escuadron_heroes = new javax.swing.JList<>();
        bt_agregar_es_he = new javax.swing.JButton();
        bt_mod_es_he = new javax.swing.JButton();
        bt_elim_es_he = new javax.swing.JButton();
        jd_escuadronV = new javax.swing.JDialog();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tf_nombre_es_vi = new javax.swing.JTextField();
        tf_localidad_es_vi = new javax.swing.JTextField();
        tf_lema_es_vi = new javax.swing.JTextField();
        tf_tipo_es_vi = new javax.swing.JTextField();
        cb_villanos = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_escuadron_villanos = new javax.swing.JList<>();
        bt_agregar_es_vi = new javax.swing.JButton();
        bt_mod_es_vi = new javax.swing.JButton();
        bt_elim_es_vi = new javax.swing.JButton();
        ppMenu = new javax.swing.JPopupMenu();
        jmiEliminarTree = new javax.swing.JMenuItem();
        jmiVerDatos = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        treePrincipal = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmHeroe = new javax.swing.JMenuItem();
        jmVillano = new javax.swing.JMenuItem();
        jmEscuadrones = new javax.swing.JMenu();
        jmEscVillanos = new javax.swing.JMenuItem();
        jmEscHeroe = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nombre:");

        jLabel4.setText("Poder:");

        jLabel5.setText("Debilidad:");

        jLabel6.setText("Fuerza:");

        jLabel7.setText("Agilidad Fisica:");

        jLabel8.setText("Agilidad Mental:");

        btAgregarHeroe.setText("Agregar");
        btAgregarHeroe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarHeroeMouseClicked(evt);
            }
        });

        jlHeroes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jlHeroes);

        bHeroeModificar.setText("Obtener valores");
        bHeroeModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bHeroeModificarMouseClicked(evt);
            }
        });

        btnHeroeModificar.setText("Modificar");
        btnHeroeModificar.setEnabled(false);
        btnHeroeModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHeroeModificarMouseClicked(evt);
            }
        });

        bHeroeEliminar.setText("Eliminar");
        bHeroeEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bHeroeEliminarMouseClicked(evt);
            }
        });

        jLabel2.setText("Heroes");

        javax.swing.GroupLayout jd_heroesLayout = new javax.swing.GroupLayout(jd_heroes.getContentPane());
        jd_heroes.getContentPane().setLayout(jd_heroesLayout);
        jd_heroesLayout.setHorizontalGroup(
            jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_heroesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jd_heroesLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_heroesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bHeroeModificar)
                .addGap(18, 18, 18)
                .addComponent(btnHeroeModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bHeroeEliminar)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_heroesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHeroeNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(spinHeroeFuerza)
                    .addComponent(spinHeroeAfisica)
                    .addComponent(spinHeroeAmental)
                    .addComponent(txtHeroePoder)
                    .addComponent(txtHeroeDebilidad))
                .addGap(52, 52, 52)
                .addComponent(btAgregarHeroe)
                .addGap(29, 29, 29))
        );
        jd_heroesLayout.setVerticalGroup(
            jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_heroesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeroeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeroePoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHeroeDebilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinHeroeFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spinHeroeAfisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spinHeroeAmental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAgregarHeroe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_heroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHeroeModificar)
                    .addComponent(btnHeroeModificar)
                    .addComponent(bHeroeEliminar))
                .addGap(24, 24, 24))
        );

        jLabel3.setText("Nombre:");

        jLabel9.setText("Poder:");

        jLabel10.setText("Debilidad:");

        jLabel11.setText("Fuerza:");

        jLabel12.setText("Agilidad Fisica:");

        jLabel13.setText("Agilidad Mental:");

        btAgregarVillano.setText("Agregar");
        btAgregarVillano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarVillanoMouseClicked(evt);
            }
        });
        btAgregarVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarVillanoActionPerformed(evt);
            }
        });

        bVillanoModificar.setText("Obtener valores");
        bVillanoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVillanoModificarMouseClicked(evt);
            }
        });

        btnVillanoModificar.setText("Modificar");
        btnVillanoModificar.setEnabled(false);
        btnVillanoModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVillanoModificarMouseClicked(evt);
            }
        });

        bVillanoEliminar.setText("Eliminar");
        bVillanoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVillanoEliminarMouseClicked(evt);
            }
        });

        jlVillanos.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jlVillanos);

        jLabel16.setText("Villano");

        javax.swing.GroupLayout jd_villanosLayout = new javax.swing.GroupLayout(jd_villanos.getContentPane());
        jd_villanos.getContentPane().setLayout(jd_villanosLayout);
        jd_villanosLayout.setHorizontalGroup(
            jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_villanosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jd_villanosLayout.createSequentialGroup()
                        .addComponent(bVillanoModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVillanoModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVillanoEliminar)))
                .addContainerGap())
            .addGroup(jd_villanosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVillanoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(spinVillanoFuerza)
                    .addComponent(spinVillanoAfisica)
                    .addComponent(spinVillanoAmental)
                    .addComponent(txtVillanoPoder, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtVillanoDebilidad, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(btAgregarVillano)
                .addGap(19, 19, 19))
            .addGroup(jd_villanosLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_villanosLayout.setVerticalGroup(
            jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_villanosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_villanosLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinVillanoFuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinVillanoAfisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinVillanoAmental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(btAgregarVillano)))
                    .addGroup(jd_villanosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtVillanoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtVillanoPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtVillanoDebilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_villanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVillanoModificar)
                    .addComponent(btnVillanoModificar)
                    .addComponent(bVillanoEliminar))
                .addGap(19, 19, 19))
        );

        jLabel20.setText("Escruadron Super Héroes");

        jLabel14.setText("Nombre");

        jLabel15.setText("Localidad de su base");

        jLabel17.setText("Lema");

        jLabel18.setText("Lider");

        jLabel19.setText("Tipo de escuadron");

        tf_tipo_es_he.setText("Escuadron heroes");
        tf_tipo_es_he.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tipo_es_heActionPerformed(evt);
            }
        });

        jl_escuadron_heroes.setModel(new DefaultListModel()
        );
        jScrollPane4.setViewportView(jl_escuadron_heroes);

        bt_agregar_es_he.setText("Agregar");
        bt_agregar_es_he.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregar_es_heMouseClicked(evt);
            }
        });

        bt_mod_es_he.setText("modificar");
        bt_mod_es_he.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mod_es_heMouseClicked(evt);
            }
        });

        bt_elim_es_he.setText("Eliminar");
        bt_elim_es_he.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_elim_es_heMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_escuadronHLayout = new javax.swing.GroupLayout(jd_escuadronH.getContentPane());
        jd_escuadronH.getContentPane().setLayout(jd_escuadronHLayout);
        jd_escuadronHLayout.setHorizontalGroup(
            jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escuadronHLayout.createSequentialGroup()
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_escuadronHLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jd_escuadronHLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jd_escuadronHLayout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_localidad_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jd_escuadronHLayout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_nombre_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_escuadronHLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_heroes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_lema_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_tipo_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_escuadronHLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(bt_agregar_es_he)
                            .addGap(62, 62, 62)
                            .addComponent(bt_mod_es_he)
                            .addGap(99, 99, 99)
                            .addComponent(bt_elim_es_he)))
                    .addGroup(jd_escuadronHLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel20)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jd_escuadronHLayout.setVerticalGroup(
            jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escuadronHLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20)
                .addGap(66, 66, 66)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_nombre_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_localidad_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(tf_lema_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cb_heroes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_tipo_es_he, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jd_escuadronHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_elim_es_he)
                    .addComponent(bt_mod_es_he)
                    .addComponent(bt_agregar_es_he)))
        );

        jLabel25.setText("Escuadron Villanos");

        jLabel26.setText("Nombre");

        jLabel27.setText("Localidad de su base");

        jLabel28.setText("Lema");

        jLabel29.setText("Tipo de escuadron");

        jLabel30.setText("Lider");

        tf_tipo_es_vi.setText("Escuadron villanos");

        jl_escuadron_villanos.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_escuadron_villanos);

        bt_agregar_es_vi.setText("Agregar");
        bt_agregar_es_vi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregar_es_viMouseClicked(evt);
            }
        });

        bt_mod_es_vi.setText("modificar");
        bt_mod_es_vi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mod_es_viMouseClicked(evt);
            }
        });

        bt_elim_es_vi.setText("Eliminar");
        bt_elim_es_vi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_elim_es_viMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_escuadronVLayout = new javax.swing.GroupLayout(jd_escuadronV.getContentPane());
        jd_escuadronV.getContentPane().setLayout(jd_escuadronVLayout);
        jd_escuadronVLayout.setHorizontalGroup(
            jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escuadronVLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_escuadronVLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_escuadronVLayout.createSequentialGroup()
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_escuadronVLayout.createSequentialGroup()
                                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_localidad_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jd_escuadronVLayout.createSequentialGroup()
                                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel26))
                                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jd_escuadronVLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_nombre_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel25)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_escuadronVLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cb_villanos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tf_lema_es_vi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_escuadronVLayout.createSequentialGroup()
                                                            .addComponent(tf_tipo_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(33, 33, 33))))))))
                                .addGap(82, 82, 82)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jd_escuadronVLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_mod_es_vi)
                    .addComponent(bt_agregar_es_vi)
                    .addComponent(bt_elim_es_vi))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_escuadronVLayout.setVerticalGroup(
            jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escuadronVLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_escuadronVLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(51, 51, 51)
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tf_nombre_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tf_localidad_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tf_lema_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(bt_agregar_es_vi)
                        .addGap(15, 15, 15)
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(bt_mod_es_vi))
                        .addGap(23, 23, 23)
                        .addGroup(jd_escuadronVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(cb_villanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_elim_es_vi)))
                    .addGroup(jd_escuadronVLayout.createSequentialGroup()
                        .addComponent(tf_tipo_es_vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jmiEliminarTree.setText("Eliminar");
        jmiEliminarTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarTreeActionPerformed(evt);
            }
        });
        ppMenu.add(jmiEliminarTree);

        jmiVerDatos.setText("Ver Datos");
        jmiVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVerDatosActionPerformed(evt);
            }
        });
        ppMenu.add(jmiVerDatos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Power Squad");
        treePrincipal.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treePrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treePrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treePrincipal);

        jMenu1.setText("Squad");

        jmHeroe.setText("Heroe");
        jmHeroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHeroeActionPerformed(evt);
            }
        });
        jMenu1.add(jmHeroe);

        jmVillano.setText("Villano");
        jmVillano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVillanoActionPerformed(evt);
            }
        });
        jMenu1.add(jmVillano);

        jmEscuadrones.setText("Escuadrones");

        jmEscVillanos.setText("Escuadrones Villanos");
        jmEscVillanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEscVillanosActionPerformed(evt);
            }
        });
        jmEscuadrones.add(jmEscVillanos);

        jmEscHeroe.setText("Escuadrones Heroes");
        jmEscHeroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEscHeroeActionPerformed(evt);
            }
        });
        jmEscuadrones.add(jmEscHeroe);

        jMenu1.add(jmEscuadrones);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmHeroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHeroeActionPerformed
        // TODO add your handling code here:
        jd_heroes.setModal(true);
        jd_heroes.setLocationRelativeTo(this);
        jd_heroes.pack();
        jd_heroes.setResizable(false);
        jd_heroes.setVisible(true);
    }//GEN-LAST:event_jmHeroeActionPerformed

    private void jmVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVillanoActionPerformed
        // TODO add your handling code here:
        jd_villanos.setModal(true);
        jd_villanos.setLocationRelativeTo(this);
        jd_villanos.pack();
        jd_villanos.setResizable(false);
        jd_villanos.setVisible(true);
    }//GEN-LAST:event_jmVillanoActionPerformed

    private void jmEscVillanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEscVillanosActionPerformed
        // TODO add your handling code here:
        jd_escuadronV.setModal(true);
        jd_escuadronV.setLocationRelativeTo(this);
        jd_escuadronV.pack();
        jd_escuadronV.setResizable(false);
        jd_escuadronV.setVisible(true);
    }//GEN-LAST:event_jmEscVillanosActionPerformed

    private void jmEscHeroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEscHeroeActionPerformed
        // TODO add your handling code here:
        jd_escuadronH.setModal(true);
        jd_escuadronH.setLocationRelativeTo(this);
        jd_escuadronH.pack();
        jd_escuadronH.setResizable(false);
        jd_escuadronH.setVisible(true);
    }//GEN-LAST:event_jmEscHeroeActionPerformed

    private void bHeroeModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHeroeModificarMouseClicked
        // MODIFICAR HEROE
        try {
            DefaultListModel modelo = (DefaultListModel) jlHeroes.getModel();
            jlHeroes.setEnabled(false);
            if (jlHeroes.getSelectedIndex() != -1) {
                btnHeroeModificar.setEnabled(true);
                bHeroeModificar.setEnabled(false);
                bHeroeEliminar.setEnabled(false);
                btAgregarHeroe.setEnabled(false);
                Heroes heroes = (Heroes) modelo.getElementAt(jlHeroes.getSelectedIndex());
                tHeroes = heroes;
                txtHeroeNombre.setText(heroes.getNombre());
                txtHeroePoder.setText(heroes.getPoder());
                txtHeroeDebilidad.setText(heroes.getDebilidad());

                spinHeroeFuerza.setValue(heroes.getFuerza());
                spinHeroeAfisica.setValue(heroes.getAgilidadFisica());
                spinHeroeAmental.setValue(heroes.getAgilidadMental());
            } else {
                JOptionPane.showMessageDialog(jd_heroes, "Error al obtener equipos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_heroes, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_bHeroeModificarMouseClicked

    private void btnHeroeModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHeroeModificarMouseClicked
        try {
            DefaultListModel modelo = (DefaultListModel) jlHeroes.getModel();
            if (jlHeroes.getSelectedIndex() != -1) {
                String nombre = txtHeroeNombre.getText();
                String poder = txtHeroePoder.getText();
                String debilidad = txtHeroeDebilidad.getText();

                int fuerza = (Integer) spinHeroeFuerza.getValue();
                int agilidadFisica = (Integer) spinHeroeAfisica.getValue();
                int agilidadMental = (Integer) spinHeroeAmental.getValue();
                String posicion = "";

                boolean error = false;
                if (fuerza < 0 || fuerza > 100) {
                    error = true;
                }
                if (agilidadFisica < 0 || agilidadFisica > 100) {
                    error = true;
                }
                if (agilidadMental < 0 || agilidadMental > 100) {
                    error = true;
                }

                if (!error) {
                    tHeroes.setNombre(nombre);
                    tHeroes.setPoder(poder);
                    tHeroes.setDebilidad(debilidad);
                    tHeroes.setFuerza(fuerza);
                    tHeroes.setAgilidadFisica(agilidadFisica);
                    tHeroes.setAgilidadMental(agilidadMental);
                    modelo.set(jlHeroes.getSelectedIndex(), tHeroes);
                    jlHeroes.setEnabled(true);
                    bHeroeModificar.setEnabled(true);
                    btnHeroeModificar.setEnabled(false);
                    bHeroeEliminar.setEnabled(true);
                    btAgregarHeroe.setEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_villanos, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnHeroeModificarMouseClicked

    private void bHeroeEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHeroeEliminarMouseClicked
        try {
            DefaultListModel modelo = (DefaultListModel) jlHeroes.getModel();
            if (jlHeroes.getSelectedIndex() != -1) {
                modelo.remove(jlHeroes.getSelectedIndex());
                // Modificar
            } else {
                JOptionPane.showMessageDialog(jd_heroes, "Error al eliminar!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_heroes, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_bHeroeEliminarMouseClicked

    private void bVillanoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVillanoModificarMouseClicked
        // TODO add your handling code here:
        // MODIFICAR VILLANO:
        try {
            DefaultListModel modelo = (DefaultListModel) jlVillanos.getModel();
            jlVillanos.setEnabled(false);
            if (jlVillanos.getSelectedIndex() != -1) {
                btnVillanoModificar.setEnabled(true);
                bVillanoModificar.setEnabled(false);
                bVillanoEliminar.setEnabled(false);
                btAgregarVillano.setEnabled(false);
                Villanos villanos = (Villanos) modelo.getElementAt(jlVillanos.getSelectedIndex());
                tVillanos = villanos;
                txtVillanoNombre.setText(villanos.getNombre());
                txtVillanoPoder.setText(villanos.getPoder());
                txtVillanoDebilidad.setText(villanos.getDebilidad());

                spinVillanoFuerza.setValue(villanos.getFuerza());
                spinVillanoAfisica.setValue(villanos.getAgilidadFisica());
                spinVillanoAmental.setValue(villanos.getAgilidadMental());
            } else {
                JOptionPane.showMessageDialog(jd_villanos, "Error al obtener villanos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_villanos, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_bVillanoModificarMouseClicked

    private void btnVillanoModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVillanoModificarMouseClicked
        // TODO add your handling code here:
        try {
            DefaultListModel modelo = (DefaultListModel) jlVillanos.getModel();
            if (jlVillanos.getSelectedIndex() != -1) {
                String nombre = txtVillanoNombre.getText();
                String poder = txtVillanoPoder.getText();
                String debilidad = txtVillanoDebilidad.getText();

                int fuerza = (Integer) spinVillanoFuerza.getValue();
                int agilidadFisica = (Integer) spinVillanoAfisica.getValue();
                int agilidadMental = (Integer) spinVillanoAmental.getValue();
                String posicion = "";

                boolean error = false;
                if (fuerza < 0 || fuerza > 100) {
                    error = true;
                }
                if (agilidadFisica < 0 || agilidadFisica > 100) {
                    error = true;
                }
                if (agilidadMental < 0 || agilidadMental > 100) {
                    error = true;
                }

                if (!error) {
                    tVillanos.setNombre(nombre);
                    tVillanos.setPoder(poder);
                    tVillanos.setDebilidad(debilidad);
                    tVillanos.setFuerza(fuerza);
                    tVillanos.setAgilidadFisica(agilidadFisica);
                    tVillanos.setAgilidadMental(agilidadMental);
                    modelo.set(jlVillanos.getSelectedIndex(), tVillanos);
                    jlVillanos.setEnabled(true);
                    bVillanoModificar.setEnabled(true);
                    btnVillanoModificar.setEnabled(false);
                    bVillanoEliminar.setEnabled(true);
                    btAgregarVillano.setEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_villanos, "Error!\n" + e.getMessage());
        }

    }//GEN-LAST:event_btnVillanoModificarMouseClicked

    private void bVillanoEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVillanoEliminarMouseClicked
        // TODO add your handling code here:
        // ELIMINAR VILLANOS
        try {
            DefaultListModel modelo = (DefaultListModel) jlVillanos.getModel();
            if (jlVillanos.getSelectedIndex() != -1) {
                modelo.remove(jlVillanos.getSelectedIndex());
                // Modificar
            } else {
                JOptionPane.showMessageDialog(jd_villanos, "Error al eliminar!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_villanos, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_bVillanoEliminarMouseClicked

    private void btAgregarVillanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarVillanoMouseClicked
        // TODO add your handling code here:
        // AGREGAR VILLANO
        try {
            boolean error = false;
            String nombre = txtVillanoNombre.getText();
            String poder = txtVillanoPoder.getText();
            String debilidad = txtVillanoDebilidad.getText();

            int fuerza = (Integer) spinVillanoFuerza.getValue();
            int agilidadFisica = (Integer) spinVillanoAfisica.getValue();
            int agilidadMental = (Integer) spinVillanoAmental.getValue();
            String posicion = "";

            if (fuerza < 0 || fuerza > 100) {
                error = true;
            }
            if (agilidadFisica < 0 || agilidadFisica > 100) {
                error = true;
            }
            if (agilidadMental < 0 || agilidadMental > 100) {
                error = true;
            }

            if (agilidadFisica + agilidadMental + fuerza == 100) {
                if (!error) {
                    ArrayList<EscuadronVillano> baseEscuadron = null;

                    Villanos v = new Villanos(nombre, poder, debilidad, baseEscuadron, fuerza, agilidadFisica, agilidadMental);
                    DefaultListModel modelo = (DefaultListModel) jlVillanos.getModel();
                    modelo.addElement(v);

                    DefaultTreeModel modeloTree = (DefaultTreeModel) treePrincipal.getModel();
                    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloTree.getRoot();
                    DefaultMutableTreeNode nodoEquipo = new DefaultMutableTreeNode(v.getNombre());
                    raiz.add(nodoEquipo);
                    modeloTree.reload();
                } else {
                    JOptionPane.showMessageDialog(jlVillanos, "Error al ingresar heroes!");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jlVillanos, "Error!\n" + e.getMessage());
        }

    }//GEN-LAST:event_btAgregarVillanoMouseClicked

    private void btAgregarVillanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarVillanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarVillanoActionPerformed

    private void btAgregarHeroeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarHeroeMouseClicked

        try {
            boolean error = false;
            String nombre = txtHeroeNombre.getText();
            String poder = txtHeroePoder.getText();
            String debilidad = txtHeroeDebilidad.getText();

            int fuerza = (Integer) spinHeroeFuerza.getValue();
            int agilidadFisica = (Integer) spinHeroeAfisica.getValue();
            int agilidadMental = (Integer) spinHeroeAmental.getValue();
            String posicion = "";

            if (fuerza < 0 || fuerza > 100) {
                error = true;
            }
            if (agilidadFisica < 0 || agilidadFisica > 100) {
                error = true;
            }
            if (agilidadMental < 0 || agilidadMental > 100) {
                error = true;
            }

            if (agilidadFisica + agilidadMental + fuerza == 100) {
                if (!error) {
                    ArrayList<EscuadronVillano> baseEscuadron = null;
                    ArrayList<EscuadronHeroe> baseEscuadronH = null;

                    Heroes h = new Heroes(nombre, poder, debilidad, baseEscuadronH, fuerza, agilidadFisica, agilidadMental);
                    DefaultListModel modelo = (DefaultListModel) jlHeroes.getModel();
                    modelo.addElement(h);

                    DefaultTreeModel modeloTree = (DefaultTreeModel) treePrincipal.getModel();
                    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloTree.getRoot();
                    DefaultMutableTreeNode nodoEquipo = new DefaultMutableTreeNode(h.getNombre());
                    raiz.add(nodoEquipo);
                    modeloTree.reload();
                } else {
                    JOptionPane.showMessageDialog(jlHeroes, "Error al ingresar heroes!");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jlHeroes, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_btAgregarHeroeMouseClicked

    private void treePrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treePrincipalMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = treePrincipal.getClosestRowForLocation(evt.getX(), evt.getY());
            treePrincipal.setSelectionRow(row);
            Object v1 = treePrincipal.getSelectionPath().getLastPathComponent();
            nodoSeleccionado = (DefaultMutableTreeNode) v1;
            if (nodoSeleccionado.getUserObject() instanceof String && nodoSeleccionado.getChildCount() == 0) {
                HeroeSeleccionado = (String) nodoSeleccionado.getUserObject();
                ppMenu.show(this, evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_treePrincipalMouseClicked

    private void jmiEliminarTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarTreeActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTreeModel modelo = (DefaultTreeModel) treePrincipal.getModel();
            DefaultListModel modeloVillano = (DefaultListModel) jlVillanos.getModel();
            DefaultListModel modeloHeroe = (DefaultListModel) jlHeroes.getModel();
            String eliminar = modelo.toString();
            modelo.removeNodeFromParent(nodoSeleccionado);
            modelo.reload();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmiEliminarTreeActionPerformed

    private void jmiVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVerDatosActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTreeModel modelo = (DefaultTreeModel) treePrincipal.getModel();
            JOptionPane.showMessageDialog(this, HeroeSeleccionado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error!\n" + e.getMessage());
        }
    }//GEN-LAST:event_jmiVerDatosActionPerformed

    private void bt_agregar_es_viMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregar_es_viMouseClicked
        EscuadronVillano x;
        try {
            String nombre = tf_nombre_es_vi.getText();
            String localidad = tf_localidad_es_vi.getText();
            String lema = tf_lema_es_vi.getText();
            String tipo = tf_tipo_es_vi.getText();
            String lider;
            if (cb_villanos == null) {
                lider = null;
            } else {
                lider = (String) cb_villanos.getSelectedItem();
            }

            escuadron_villanos.add(new EscuadronVillano(nombre, localidad, lider, lema, tipo));
            jd_escuadronV.setEnabled(true);

            DefaultListModel modelo = (DefaultListModel) jl_escuadron_villanos.getModel();
            modelo.addElement(new EscuadronHeroe(nombre, localidad, lider, lema, tipo));
            jl_escuadron_villanos.setModel(modelo);
            JOptionPane.showMessageDialog(jd_escuadronV, "Se añadio exitosamente el escuadron");
            
            DefaultTreeModel modeloTree = (DefaultTreeModel) treePrincipal.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloTree.getRoot();
            DefaultMutableTreeNode nodoEquipo = new DefaultMutableTreeNode(raiz.getAllowsChildren());
            raiz.add(nodoEquipo);
            modeloTree.reload();

            tf_nombre_es_vi.setText("");
            tf_localidad_es_vi.setText("");
            tf_lema_es_vi.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_escuadronV, "ocurrio un error y no se guardaron los datos");
        }

    }//GEN-LAST:event_bt_agregar_es_viMouseClicked

    private void bt_mod_es_viMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mod_es_viMouseClicked
        int d = jl_escuadron_villanos.getSelectedIndex();
        if (d >= 0) {
            String nombre = JOptionPane.showInputDialog("nuevo nombre");
            String localidad = JOptionPane.showInputDialog("nueva localidad");
            String lema = JOptionPane.showInputDialog("nuevo lema");

            DefaultListModel modelo = (DefaultListModel) jl_escuadron_villanos.getModel();

            ((EscuadronVillano) modelo.get(d)).setNombre(nombre);
            ((EscuadronVillano) modelo.get(d)).setLocalidad(localidad);
            ((EscuadronVillano) modelo.get(d)).setLema(lema);
            escuadron_villanos.get(d).setLocalidad(localidad);
            escuadron_villanos.get(d).setLema(lema);
        } else {
            JOptionPane.showMessageDialog(jd_escuadronV, "fila no seleccionada"
                    + "");
        }
    }//GEN-LAST:event_bt_mod_es_viMouseClicked

    private void bt_elim_es_viMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_elim_es_viMouseClicked
        // TODO add your handling code here:
        int d = jl_escuadron_villanos.getSelectedIndex();
        if (d >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_escuadron_villanos.getModel();

            modelo.remove(d);
            escuadron_villanos.remove(d);
        }
    }//GEN-LAST:event_bt_elim_es_viMouseClicked

    private void tf_tipo_es_heActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tipo_es_heActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tipo_es_heActionPerformed

    private void bt_agregar_es_heMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregar_es_heMouseClicked
        // TODO add your handling code here:
        //Agregar escuadron heroes
        EscuadronHeroe x;
        try {
            String nombre = tf_nombre_es_he.getText();
            String localidad = tf_localidad_es_he.getText();
            String lema = tf_lema_es_he.getText();
            String tipo = tf_tipo_es_he.getText();
            String lider;
            if (cb_heroes == null) {
                lider = null;
            } else {
                lider = (String) cb_heroes.getSelectedItem();
            }

            escuadron_heroes.add(new EscuadronHeroe(nombre, localidad, lider, lema, tipo));
            jd_escuadronH.setEnabled(true);

            DefaultListModel modelo = (DefaultListModel) jl_escuadron_heroes.getModel();
            modelo.addElement(new EscuadronHeroe(nombre, localidad, lider, lema, tipo));
            jl_escuadron_heroes.setModel(modelo);
            JOptionPane.showMessageDialog(jd_escuadronH, "Se añadio exitosamente el escuadron");
            
            DefaultTreeModel modeloTree = (DefaultTreeModel) treePrincipal.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloTree.getRoot();
            DefaultMutableTreeNode nodoEquipo = new DefaultMutableTreeNode(raiz.getAllowsChildren());
            raiz.add(nodoEquipo);
            modeloTree.reload();

            tf_nombre_es_he.setText("");
            tf_localidad_es_he.setText("");
            tf_lema_es_he.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(jd_escuadronH, "ocurrio un error y no se guardaron los datos");
        }

    }//GEN-LAST:event_bt_agregar_es_heMouseClicked

    private void bt_mod_es_heMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mod_es_heMouseClicked
        int d = jl_escuadron_heroes.getSelectedIndex();
        if (d >= 0) {
            String nombre = JOptionPane.showInputDialog("nuevo nombre");
            String localidad = JOptionPane.showInputDialog("nueva localidad");
            String lema = JOptionPane.showInputDialog("nuevo lema");

            DefaultListModel modelo = (DefaultListModel) jl_escuadron_heroes.getModel();

            ((EscuadronHeroe) modelo.get(d)).setNombre(nombre);
            ((EscuadronHeroe) modelo.get(d)).setLocalidad(localidad);
            ((EscuadronHeroe) modelo.get(d)).setLema(lema);
            escuadron_heroes.get(d).setLocalidad(localidad);
            escuadron_heroes.get(d).setLema(lema);
        } else {
            JOptionPane.showMessageDialog(jd_escuadronH, "fila no seleccionada"
                    + "");
        }
    }//GEN-LAST:event_bt_mod_es_heMouseClicked

    private void bt_elim_es_heMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_elim_es_heMouseClicked
        // TODO add your handling code here:
        int d = jl_escuadron_heroes.getSelectedIndex();
        if (d >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_escuadron_heroes.getModel();

            modelo.remove(d);
            escuadron_heroes.remove(d);
        }
    }//GEN-LAST:event_bt_elim_es_heMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHeroeEliminar;
    private javax.swing.JButton bHeroeModificar;
    private javax.swing.JButton bVillanoEliminar;
    private javax.swing.JButton bVillanoModificar;
    private javax.swing.JButton btAgregarHeroe;
    private javax.swing.JButton btAgregarVillano;
    private javax.swing.JButton bt_agregar_es_he;
    private javax.swing.JButton bt_agregar_es_vi;
    private javax.swing.JButton bt_elim_es_he;
    private javax.swing.JButton bt_elim_es_vi;
    private javax.swing.JButton bt_mod_es_he;
    private javax.swing.JButton bt_mod_es_vi;
    private javax.swing.JButton btnHeroeModificar;
    private javax.swing.JButton btnVillanoModificar;
    private javax.swing.JComboBox<String> cb_heroes;
    private javax.swing.JComboBox<String> cb_villanos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JDialog jd_escuadronH;
    private javax.swing.JDialog jd_escuadronV;
    private javax.swing.JDialog jd_heroes;
    private javax.swing.JDialog jd_villanos;
    private javax.swing.JList<String> jlHeroes;
    private javax.swing.JList<String> jlVillanos;
    private javax.swing.JList<String> jl_escuadron_heroes;
    private javax.swing.JList<String> jl_escuadron_villanos;
    private javax.swing.JMenuItem jmEscHeroe;
    private javax.swing.JMenuItem jmEscVillanos;
    private javax.swing.JMenu jmEscuadrones;
    private javax.swing.JMenuItem jmHeroe;
    private javax.swing.JMenuItem jmVillano;
    private javax.swing.JMenuItem jmiEliminarTree;
    private javax.swing.JMenuItem jmiVerDatos;
    private javax.swing.JPopupMenu ppMenu;
    private javax.swing.JSpinner spinHeroeAfisica;
    private javax.swing.JSpinner spinHeroeAmental;
    private javax.swing.JSpinner spinHeroeFuerza;
    private javax.swing.JSpinner spinVillanoAfisica;
    private javax.swing.JSpinner spinVillanoAmental;
    private javax.swing.JSpinner spinVillanoFuerza;
    private javax.swing.JTextField tf_lema_es_he;
    private javax.swing.JTextField tf_lema_es_vi;
    private javax.swing.JTextField tf_localidad_es_he;
    private javax.swing.JTextField tf_localidad_es_vi;
    private javax.swing.JTextField tf_nombre_es_he;
    private javax.swing.JTextField tf_nombre_es_vi;
    private javax.swing.JTextField tf_tipo_es_he;
    private javax.swing.JTextField tf_tipo_es_vi;
    private javax.swing.JTree treePrincipal;
    private javax.swing.JTextField txtHeroeDebilidad;
    private javax.swing.JTextField txtHeroeNombre;
    private javax.swing.JTextField txtHeroePoder;
    private javax.swing.JTextField txtVillanoDebilidad;
    private javax.swing.JTextField txtVillanoNombre;
    private javax.swing.JTextField txtVillanoPoder;
    // End of variables declaration//GEN-END:variables
}
