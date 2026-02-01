package secao15;

import java.io.*;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

public class arquivo {
    public static void main(String[] args) {
        
        // 1 - Leitura de arquivo
        String currentDir = System.getProperty("user.dir") + "/secao15/";
        System.out.println(currentDir);


        // FileReader = caracter por caracter
        //BufferedReader = linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;
            
            while ((caracter = reader.read()) != -1) {
                System.out.print((char)caracter);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            } catch (Exception e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
            
        // 2 - Escrever em arquivos
        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());        
        }
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo em arquivo com BufferedWriter \n");
            writer.newLine();
            writer.write("Escrevendo em arquivo 2 com BufferedWriter");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());   
        }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            
            writer.append("testando");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());   
        }
    
        // 3 - serializando objetos
        Pessoa pessoa = new Pessoa("João", 30);

        System.out.println("Pessoa antes da serialização: " + pessoa.getNome() + ", " + pessoa.getIdade());

        // Serialização
        // arquivos serializados terminam com .ser
        // Serializar = Output
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            
            oos.writeObject(pessoa);
            System.out.println("objeto serializado com sucesso.");
        
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: " + e.getMessage());
        }

        // Desserialização
        // Desserializar = Input
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))) {
            
            Pessoa pessoaDesserializada = (Pessoa) ois.readObject();
            System.out.println("Pessoa desserializada: " + pessoaDesserializada.getNome() + ", " + pessoaDesserializada.getIdade());
        
        } catch (Exception e) {
            System.out.println("Erro ao desserializar objeto: " + e.getMessage());
        }

        // 4 - Manipulando binarios
        try (FileInputStream fis = new FileInputStream(currentDir + "bolo.jpg");
            FileOutputStream fos = new FileOutputStream(currentDir + "bolo_copia.jpg")) {
            


            int byteData;

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
                
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao manipular arquivo binario: " + e.getMessage());
        }

        // 5 - manipulação de imagem

        // bolo.jpg e colocar um texto no centro
        
        try {
            BufferedImage imagem = ImageIO.read(new File(currentDir + "bolo.jpg"));

            if (imagem == null) {
                System.out.println("A imagem não foi carregada corretamente.");
                return;
            }

            Graphics2D g2d = imagem.createGraphics();

            g2d.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no centro";

            // centralizar o texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            //posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // desenhar retangulo
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            // desenhar o texto em cima do retangulo
            g2d.setColor(Color.RED);
            g2d.drawString(texto, x, y);

            // liberação de recursos
            g2d.dispose();

            // salvar a imagem
            File outFile = new File(currentDir + "Bolo_com_texto.png");

            ImageIO.write(imagem, "png", outFile);

            System.out.println("Texto gerado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao carregar imagem: " + e.getMessage());
        }
    
    }
}
