public class EstacaoTratamento {

    public void gradeamento (){
        System.out.println("""
                \nGradeamento:

                A água residual que vem das residências deve conter cerca de 1% de sólidos e 99% de material líquido. Em razão 
                disso, a primeira etapa do procedimento é a retenção de materiais mais grosseiros, como o lixo, em um filtro 
                formado por grades. Essa primeira filtragem ajuda a deixar o líquido livre dos resíduos sólidos que foram 
                descartados incorretamente na rede de esgoto.
                """);
    }
    public void desaneracao (){
        System.out.println("""
                \nDesaneração:

                Em seguida, o esgoto segue para a caixa de areia, onde é realizada a remoção de todos os detritos sólidos presentes 
                nele e que possam ter escapado ao processo anterior, mediante sedimentação. A areia, os pedriscos, os cascalhos e 
                outros elementos vão para o fundo do tanque e o líquido que permanece na superfície é encaminhado para a próxima 
                etapa.
                """);
    }
    public void tratamentoBiologico (){
        System.out.println("""
                \nTratamento Biológico:

                Já sem sólidos visíveis, o esgoto é enviado para o tratamento biológico no tanque de aeração. Lá, ele é exposto à 
                ação de seres microscópicos, que promovem reações bioquímicas e condensam em flocos de lodo a matéria orgânica 
                que até então estava dissolvida no efluente. É o caso do rotífero, micrometazoários que se alimentam de bactérias 
                e partículas minúsculas de sólidos, e também do tardígrado, considerado o animal mais resistente do mundo, cuja 
                presença ajuda a sinalizar a qualidade da limpeza realizada no esgoto.
                """);
    }
    public void decantacao (){
        System.out.println("""
                \nDecantação:

                Depois do tratamento biológico, o líquido é submetido a um processo de decantação. O lodo formado vai para o fundo 
                do tanque, separando-se da parte líquida, que já está livre de impurezas. Essa matéria acaba se tornando um 
                subproduto do chamado biosólido, que pode ser usado na agricultura.
                """);
    }
    public void descarte (){
        System.out.println("""
                \nDescarte: 

                O lodo produzido no processo é desidratado e levado para um aterro sanitário especializado. O esgoto clarificado e 
                corretamente tratado é devolvido para o meio ambiente. Em alguns casos, o efluente podem passar por tratamentos 
                avançados específicos e serem transformados em água de reúso, uma solução sustentável que contribui para a 
                preservação da água potável do planeta.
                """);
    }
    public void leitoDeSecagem (){
        System.out.println("""
                \nLeito de Secagem:

                O leito de secagem é um sistema que desidrata o lodo proveniente do tratamento de esgoto, tornando-o mais fácil 
                de manusear e descartar. É um processo natural que não requer energia extra para aquecimento ou ventilação. 

                Como funciona:

                * O lodo é espalhado sobre uma superfície porosa
                * A água drena e evapora
                * O resíduo sólido fica mais estável e fácil de manusear
                """);
    }
    public void encerrarPrograma (){
        System.out.println("""
                \nO programa foi encerrado.
                """);
    }

}
