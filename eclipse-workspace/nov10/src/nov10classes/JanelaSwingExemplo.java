package nov10classes;
 
import javax.swing.*;
 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class JanelaSwingExemplo {
    public static void main(String[] args) {
        // Criar a frame
        JFrame frame = new JFrame("Exemplo de Janela Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerramento da janela leva ao fim do processo da aplicação
        frame.setSize(400, 300);
 
        // GridLayout com 5 linhas e 1 coluna
        frame.setLayout(new GridLayout(5, 1));
 
        // Rótulo e campo de entrada para o nome
        JPanel painelNome = new JPanel(new FlowLayout());
        JLabel labelNome = new JLabel("Nome: ");
        JTextField campoNome = new JTextField(20);
        painelNome.add(labelNome);
        painelNome.add(campoNome);
 
        // Painel para os botões de rádio para o sexo
        JPanel painelSexo = new JPanel(new FlowLayout());
        JLabel labelSexo = new JLabel("Sexo: ");
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(masculino);
        grupoSexo.add(feminino);
        painelSexo.add(labelSexo);
        painelSexo.add(masculino);
        painelSexo.add(feminino);
 
        // Painel para as caixas de seleção para hobbies
        JPanel painelHobbies = new JPanel(new FlowLayout());
        JLabel labelHobbies = new JLabel("Hobbies:");
        JCheckBox leitura = new JCheckBox("Leitura");
        JCheckBox desporto = new JCheckBox("Desporto");
        JCheckBox musica = new JCheckBox("Música");
        painelHobbies.add(labelHobbies);
        painelHobbies.add(leitura);
        painelHobbies.add(desporto);
        painelHobbies.add(musica);
 
        // Botão de submissão
        JButton botaoSubmeter = new JButton("Submeter");
        botaoSubmeter.addActionListener(new ActionListener() { // escutar ou monitorar evento de ação 
            @Override // método está a sobrescrever método da superclasse
            public void actionPerformed(ActionEvent e) { // informações sobre o evento que foi disparado
 
                String nome = campoNome.getText();
                String sexo = masculino.isSelected() ? "Masculino" : feminino.isSelected() ?
                        "Feminino" : "Não especificado";
 
                StringBuilder hobbies = new StringBuilder();
                if (leitura.isSelected()) hobbies.append("Leitura ");
                if (desporto.isSelected()) hobbies.append("Desporto ");
                if (musica.isSelected()) hobbies.append("Música ");
 
                JOptionPane.showMessageDialog(frame,
                        "Nome: " + nome + "\nSexo: " + sexo + "\nHobbies: " + (hobbies.length() > 0 ? hobbies.toString() : "Nenhum"));
            }
        });
 
        // Adicionar os painéis e o botão à frame
        frame.add(painelNome);
        frame.add(painelSexo);
        frame.add(painelHobbies);
        frame.add(botaoSubmeter);
 
        // Tornar a frame visível
        frame.setVisible(true);
    }
}