import java.util.Scanner;
 
public class Menu {
 
    Scanner ler = new Scanner(System.in);
 
    Animal[] animais = new Animal[100];
    Produto[] produtos = new Produto[100];
    Venda[] vendas = new Venda[100];
 
    int qtdAnimais = 0;
    int qtdProdutos = 0;
    int qtdVendas = 0;
 
    int codigoAnimal = 1;
    int codigoProduto = 1;
    int codigoVenda = 1;
 
    public void menuPrincipal() {
 
        while (true) {
 
            System.out.println("\n===== CLÍNICA VETERINARIA =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");
 
            int opcao = ler.nextInt();
            ler.nextLine();
 
            switch (opcao) {
 
                case 1:
                    menuCadastro();
                    break;
 
                case 2:
                    menuPesquisa();
                    break;
 
                case 3:
                    menuAlteracao();
                    break;
 
                case 4:
                    menuExclusao();
                    break;
 
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
 
                default:
                    System.out.println("Opção inválida.");
 
            }
 
        }
 
    }
 
    public void menuCadastro() {
 
        while (true) {
 
            System.out.println("\n===== CADASTRO =====");
            System.out.println("1 - Animal");
            System.out.println("2 - Produto");
            System.out.println("3 - Venda");
            System.out.println("0 - Voltar");
 
            int opcao = ler.nextInt();
            ler.nextLine();
 
            switch (opcao) {
 
                case 1:
                    cadastrarAnimal();
                    break;
 
                case 2:
                    cadastrarProduto();
                    break;
 
                case 3:
                    cadastrarVenda();
                    break;
 
                case 0:
                    return;
 
                default:
                    System.out.println("Opção inválida.");
 
            }
 
        }
 
    }
 
    public void menuPesquisa() {
 
        while (true) {
 
            System.out.println("\n===== PESQUISA =====");
            System.out.println("1 - Animal");
            System.out.println("2 - Produto");
            System.out.println("3 - Venda");
            System.out.println("0 - Voltar");
 
            int opcao = ler.nextInt();
            ler.nextLine();
 
            switch (opcao) {
 
                case 1:
                    pesquisarAnimal();
                    break;
 
                case 2:
                    pesquisarProduto();
                    break;
 
                case 3:
                    pesquisarVenda();
                    break;
 
                case 0:
                    return;
 
                default:
                    System.out.println("Opção inválida.");
 
            }
 
        }
 
    }
 
    public void menuAlteracao() {
 
        while (true) {
 
            System.out.println("\n===== ALTERAÇÃO =====");
            System.out.println("1 - Animal");
            System.out.println("2 - Produto");
            System.out.println("3 - Venda");
            System.out.println("0 - Voltar");
 
            int opcao = ler.nextInt();
            ler.nextLine();
 
            switch (opcao) {
 
                case 1:
                    alterarAnimal();
                    break;
 
                case 2:
                    alterarProduto();
                    break;
 
                case 3:
                    alterarVenda();
                    break;
 
                case 0:
                    return;
 
                default:
                    System.out.println("Opção inválida.");
 
            }
 
        }
 
    }
 
    public void menuExclusao() {
 
        while (true) {
 
            System.out.println("\n===== EXCLUSÃO =====");
            System.out.println("1 - Animal");
            System.out.println("2 - Produto");
            System.out.println("3 - Venda");
            System.out.println("0 - Voltar");
 
            int opcao = ler.nextInt();
            ler.nextLine();
 
            switch (opcao) {
 
                case 1:
                    excluirAnimal();
                    break;
 
                case 2:
                    excluirProduto();
                    break;
 
                case 3:
                    excluirVenda();
                    break;
 
                case 0:
                    return;
 
                default:
                    System.out.println("Opção inválida.");
 
            }
 
        }
 
    }
 
    public void cadastrarAnimal() {
 
        if (qtdAnimais == animais.length) {
            System.out.println("Limite de animais atingido.");
            return;
        }
 
        System.out.println("\nQual animal você deseja cadastrar?");
        System.out.println("1 - Cão");
        System.out.println("2 - Gato");
 
        int tipo = ler.nextInt();
        ler.nextLine();
 
        System.out.print("Nome: ");
        String nome = ler.nextLine();
 
        if (nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return;
        }
 
        System.out.print("Idade: ");
        int idade = ler.nextInt();
        ler.nextLine();
 
        if (idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
 
        System.out.print("Raça: ");
        String raca = ler.nextLine();
 
        if (tipo == 1) {
 
            System.out.print("Porte: ");
            String porte = ler.nextLine();
 
            animais[qtdAnimais] = new Cao(codigoAnimal, nome, idade, raca, porte);
 
        } else if (tipo == 2) {
 
            System.out.print("Pelagem: ");
            String pelagem = ler.nextLine();
 
            animais[qtdAnimais] = new Gato(codigoAnimal, nome, idade, raca, pelagem);
 
        } else {
 
            System.out.println("Tipo inválido.");
            return;
 
        }
 
        System.out.println("Animal cadastrado com sucesso.");
        System.out.println("Código: " + codigoAnimal);
 
        qtdAnimais++;
        codigoAnimal++;
 
    }
 
    public void pesquisarAnimal() {
 
        if (qtdAnimais == 0) {
 
            System.out.println("Nenhum animal cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do animal que deseja pesquisar:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdAnimais) {
 
            if (animais[i].getCodigo() == codigo) {
 
                animais[i].mostrarDados();
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Animal não encontrado.");
 
    }
 
    public void alterarAnimal() {
 
        if (qtdAnimais == 0) {
 
            System.out.println("Nenhum animal cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do animal que deseja alterar:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdAnimais) {
 
            if (animais[i].getCodigo() == codigo) {
 
                animais[i].mostrarDados();
 
                boolean alterando = true;
 
                while (alterando) {
 
                    System.out.println("\n--- O que deseja alterar? ---");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
 
                    if (animais[i] instanceof Cao) {
                        System.out.println("3 - Raça");
                        System.out.println("4 - Porte");
                    } else if (animais[i] instanceof Gato) {
                        System.out.println("3 - Raça");
                        System.out.println("4 - Pelagem");
                    }
 
                    System.out.println("0 - Concluir");
 
                    int campo = ler.nextInt();
                    ler.nextLine();
 
                    switch (campo) {
 
                        case 1:
                            System.out.print("Novo nome: ");
                            animais[i].setNome(ler.nextLine());
                            System.out.println("Nome alterado.");
                            break;
 
                        case 2:
                            System.out.print("Nova idade: ");
                            animais[i].setIdade(ler.nextInt());
                            ler.nextLine();
                            System.out.println("Idade alterada.");
                            break;
 
                        case 3:
                            System.out.print("Nova raça: ");
                            String novaRaca = ler.nextLine();
                            if (animais[i] instanceof Cao) {
                                ((Cao) animais[i]).setRaca(novaRaca);
                            } else if (animais[i] instanceof Gato) {
                                ((Gato) animais[i]).setRaca(novaRaca);
                            }
                            System.out.println("Raça alterada.");
                            break;
 
                        case 4:
                            if (animais[i] instanceof Cao) {
                                System.out.print("Novo porte: ");
                                ((Cao) animais[i]).setPorte(ler.nextLine());
                                System.out.println("Porte alterado.");
                            } else if (animais[i] instanceof Gato) {
                                System.out.print("Nova pelagem: ");
                                ((Gato) animais[i]).setPelagem(ler.nextLine());
                                System.out.println("Pelagem alterada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;
 
                        case 0:
                            alterando = false;
                            break;
 
                        default:
                            System.out.println("Opção inválida.");
 
                    }
 
                }
 
                System.out.println("Animal alterado com sucesso.");
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Animal não encontrado.");
 
    }
 
    public void excluirAnimal() {
 
        if (qtdAnimais == 0) {
 
            System.out.println("Nenhum animal cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do animal que deseja excluir:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdAnimais) {
 
            if (animais[i].getCodigo() == codigo) {
 
                while (i < qtdAnimais - 1) {
 
                    animais[i] = animais[i + 1];
 
                    i++;
 
                }
 
                animais[qtdAnimais - 1] = null;
 
                qtdAnimais--;
 
                System.out.println("Animal excluído.");
 
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Animal não encontrado.");
 
    }
 
    public void cadastrarProduto() {
 
        if (qtdProdutos == produtos.length) {
            System.out.println("Limite de produtos atingido.");
            return;
        }
 
        System.out.println("\nQual produto você deseja cadastrar?");
        System.out.println("1 - Ração");
        System.out.println("2 - Brinquedo");
        System.out.println("3 - Medicamento");
 
        int tipo = ler.nextInt();
        ler.nextLine();
 
        System.out.print("Nome: ");
        String nome = ler.nextLine();
 
        if (nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return;
        }
 
        System.out.print("Preço: ");
        double preco = ler.nextDouble();
        ler.nextLine();
 
        if (preco <= 0) {
            System.out.println("Preço inválido.");
            return;
        }
 
        if (tipo == 1) {
 
            System.out.print("Marca: ");
            String marca = ler.nextLine();
 
            System.out.print("Peso: ");
            String peso = ler.nextLine();
 
            produtos[qtdProdutos] = new Racao(codigoProduto, nome, preco, marca, peso);
 
        } else if (tipo == 2) {
 
            System.out.print("Material: ");
            String material = ler.nextLine();
 
            System.out.print("Porte indicado: ");
            String porte = ler.nextLine();
 
            produtos[qtdProdutos] = new Brinquedo(codigoProduto, nome, preco, material, porte);
 
        } else if (tipo == 3) {
 
            System.out.print("Fabricante: ");
            String fabricante = ler.nextLine();
 
            System.out.print("Validade: ");
            String validade = ler.nextLine();
 
            produtos[qtdProdutos] = new Medicamento(codigoProduto, nome, preco, fabricante, validade);
 
        } else {
 
            System.out.println("Tipo inválido.");
            return;
 
        }
 
        qtdProdutos++;
        codigoProduto++;
 
        System.out.println("Produto cadastrado com sucesso.");
 
    }
 
    public void pesquisarProduto() {
 
        if (qtdProdutos == 0) {
 
            System.out.println("Nenhum produto cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do produto que deseja pesquisar:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdProdutos) {
 
            if (produtos[i].getCodigo() == codigo) {
 
                produtos[i].mostrarDados();
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Produto não encontrado.");
 
    }
 
    public void alterarProduto() {
 
        if (qtdProdutos == 0) {
 
            System.out.println("Nenhum produto cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do produto que deseja alterar:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdProdutos) {
 
            if (produtos[i].getCodigo() == codigo) {
 
                produtos[i].mostrarDados();
 
                boolean alterando = true;
 
                while (alterando) {
 
                    System.out.println("\n--- O que deseja alterar? ---");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Preço");
 
                    if (produtos[i] instanceof Racao) {
                        System.out.println("3 - Marca");
                        System.out.println("4 - Peso");
                    } else if (produtos[i] instanceof Brinquedo) {
                        System.out.println("3 - Material");
                        System.out.println("4 - Porte indicado");
                    } else if (produtos[i] instanceof Medicamento) {
                        System.out.println("3 - Fabricante");
                        System.out.println("4 - Validade");
                    }
 
                    System.out.println("0 - Concluir");
 
                    int campo = ler.nextInt();
                    ler.nextLine();
 
                    switch (campo) {
 
                        case 1:
                            System.out.print("Novo nome: ");
                            produtos[i].setNome(ler.nextLine());
                            System.out.println("Nome alterado.");
                            break;
 
                        case 2:
                            System.out.print("Novo preço: ");
                            produtos[i].setPreco(ler.nextDouble());
                            ler.nextLine();
                            System.out.println("Preço alterado.");
                            break;
 
                        case 3:
                            if (produtos[i] instanceof Racao) {
                                System.out.print("Nova marca: ");
                                ((Racao) produtos[i]).setMarca(ler.nextLine());
                                System.out.println("Marca alterada.");
                            } else if (produtos[i] instanceof Brinquedo) {
                                System.out.print("Novo material: ");
                                ((Brinquedo) produtos[i]).setMaterial(ler.nextLine());
                                System.out.println("Material alterado.");
                            } else if (produtos[i] instanceof Medicamento) {
                                System.out.print("Novo fabricante: ");
                                ((Medicamento) produtos[i]).setFabricante(ler.nextLine());
                                System.out.println("Fabricante alterado.");
                            }
                            break;
 
                        case 4:
                            if (produtos[i] instanceof Racao) {
                                System.out.print("Novo peso: ");
                                ((Racao) produtos[i]).setPeso(ler.nextLine());
                                System.out.println("Peso alterado.");
                            } else if (produtos[i] instanceof Brinquedo) {
                                System.out.print("Novo porte indicado: ");
                                ((Brinquedo) produtos[i]).setPorteIndicado(ler.nextLine());
                                System.out.println("Porte indicado alterado.");
                            } else if (produtos[i] instanceof Medicamento) {
                                System.out.print("Nova validade: ");
                                ((Medicamento) produtos[i]).setValidade(ler.nextLine());
                                System.out.println("Validade alterada.");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;
 
                        case 0:
                            alterando = false;
                            break;
 
                        default:
                            System.out.println("Opção inválida.");
 
                    }
 
                }
 
                System.out.println("Produto alterado com sucesso.");
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Produto não encontrado.");
 
    }
 
    public void excluirProduto() {
 
        if (qtdProdutos == 0) {
 
            System.out.println("Nenhum produto cadastrado.");
            return;
 
        }
 
        System.out.println("Digite o código do produto que deseja excluir:");
        System.out.print("Código: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        int i = 0;
 
        while (i < qtdProdutos) {
 
            if (produtos[i].getCodigo() == codigo) {
 
                while (i < qtdProdutos - 1) {
 
                    produtos[i] = produtos[i + 1];
 
                    i++;
 
                }
 
                produtos[qtdProdutos - 1] = null;
 
                qtdProdutos--;
 
                System.out.println("Produto excluído.");
 
                return;
 
            }
 
            i++;
 
        }
 
        System.out.println("Produto não encontrado.");
 
    }
 
    public void cadastrarVenda() {
 
        if (qtdVendas == vendas.length) {
 
            System.out.println("Limite de vendas atingido.");
            return;
 
        }
 
        if (qtdAnimais == 0 && qtdProdutos == 0) {
 
            System.out.println("Cadastre pelo menos um animal e um produto.");
            return;
 
        }
 
        if (qtdAnimais == 0) {
 
            System.out.println("Cadastre pelo menos um animal antes de registrar uma venda.");
            return;
 
        }
 
        if (qtdProdutos == 0) {
 
            System.out.println("Cadastre pelo menos um produto antes de registrar uma venda.");
            return;
 
        }
 
        System.out.println("Digite o código do animal para a venda:");
        System.out.print("Código do animal: ");
        int codAnimal = ler.nextInt();
        ler.nextLine();
 
        Animal animal = null;
 
        for (int i = 0; i < qtdAnimais; i++) {
 
            if (animais[i].getCodigo() == codAnimal) {
 
                animal = animais[i];
                break;
 
            }
 
        }
 
        if (animal == null) {
 
            System.out.println("Animal não encontrado.");
            return;
 
        }
 
        System.out.println("Digite o código do produto para a venda:");
        System.out.print("Código do produto: ");
        int codProduto = ler.nextInt();
        ler.nextLine();
 
        Produto produto = null;
 
        for (int i = 0; i < qtdProdutos; i++) {
 
            if (produtos[i].getCodigo() == codProduto) {
 
                produto = produtos[i];
                break;
 
            }
 
        }
 
        if (produto == null) {
 
            System.out.println("Produto não encontrado.");
            return;
 
        }
 
        System.out.print("Data (dd/mm/aaaa): ");
        String data = ler.nextLine();
 
        System.out.print("Quantidade: ");
        int quantidade = ler.nextInt();
        ler.nextLine();
 
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
 
        double total = produto.getPreco() * quantidade;
 
        vendas[qtdVendas] = new Venda(codigoVenda, data, codAnimal, codProduto, quantidade, total);
 
        qtdVendas++;
        codigoVenda++;
 
        System.out.println("Venda cadastrada com sucesso.");
        System.out.printf("Total: R$ %.2f%n", total);
 
    }
 
    public void pesquisarVenda() {
 
        if (qtdVendas == 0) {
 
            System.out.println("Nenhuma venda cadastrada.");
            return;
 
        }
 
        System.out.println("Digite o código da venda que deseja pesquisar:");
        System.out.print("Código da venda: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        for (int i = 0; i < qtdVendas; i++) {
 
            if (vendas[i].getCodigo() == codigo) {
 
                vendas[i].mostrarDados();
                return;
 
            }
 
        }
 
        System.out.println("Venda não encontrada.");
 
    }
 
    public void alterarVenda() {
 
        System.out.println("Alteração de venda não implementada.");
        System.out.println("Exclua e cadastre novamente.");
 
    }
 
    public void excluirVenda() {
 
        if (qtdVendas == 0) {
 
            System.out.println("Nenhuma venda cadastrada.");
            return;
 
        }
 
        System.out.println("Digite o código da venda que deseja excluir:");
        System.out.print("Código da venda: ");
        int codigo = ler.nextInt();
        ler.nextLine();
 
        for (int i = 0; i < qtdVendas; i++) {
 
            if (vendas[i].getCodigo() == codigo) {
 
                for (int j = i; j < qtdVendas - 1; j++) {
 
                    vendas[j] = vendas[j + 1];
 
                }
 
                vendas[qtdVendas - 1] = null;
 
                qtdVendas--;
 
                System.out.println("Venda excluída.");
 
                return;
 
            }
 
        }
 
        System.out.println("Venda não encontrada.");
 
    }
 
}