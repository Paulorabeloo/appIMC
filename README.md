## Aplicativo de Cálculo de IMC (Índice de Massa Corporal)

O código fornecido implementa um aplicativo Android que calcula o Índice de Massa Corporal (IMC) e fornece uma classificação de acordo com o valor do IMC. O aplicativo segue as seguintes etapas:

A interface do usuário é composta por três elementos principais:

Dois campos de entrada (EditText): Um para o peso (editPeso) e outro para a altura (editAltura).
Um botão (Button): Que, ao ser clicado, aciona o cálculo do IMC.
Um texto (TextView): Para exibir o resultado do IMC e a respectiva classificação.

### Cálculo do IMC:

Ao clicar no botão, o aplicativo coleta os valores inseridos pelo usuário para peso e altura.
O peso e a altura são convertidos para valores numéricos (dois decimais) e utilizados para calcular o IMC.
​ 
### Classificação do IMC:

#### Com base no valor calculado do IMC, o aplicativo determina a classificação do usuário e exibe uma mensagem correspondente:
- Abaixo do Peso: IMC menor que 18,5
- Peso Normal: IMC entre 18,5 e 24,9
- Sobrepeso: IMC entre 25,0 e 29,9
- Obesidade: IMC entre 30,0 e 34,9
- Obesidade Grau II: IMC entre 35,0 e 39,9
- Obesidade Grau III: IMC maior que 40
 
### Validação de Entrada:

Se os valores inseridos pelo usuário não forem válidos (não numéricos ou nulos), o aplicativo exibe uma mensagem solicitando a inserção de valores válidos.

![image](https://github.com/user-attachments/assets/3532c453-a215-4b76-829e-bb2cd328541b) ![image](https://github.com/user-attachments/assets/73eb5c10-b407-4984-9658-01c70e72659d) ![image](https://github.com/user-attachments/assets/4167e5ae-3a91-48ef-9d03-cbd1f9f45034)




