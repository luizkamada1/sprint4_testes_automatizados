# 🏍️ LegTech – Testes Unitários (JUnit + Maven)

## 👥 Integrantes:
- Eduardo Guilherme Dias - RM557886 - 2TDSPV
- Gabriel Alves Thomaz - RM558637 - 2TDSPV
- Luiz Sadao Kamada – RM557652 – 2TDSPV

## ✅ LINKS IMPORTANTES
- Projeto Azure DevOps: https://dev.azure.com/RM557886/LegTech
- Link Video: https://youtu.be/iS4LEBBy2jw

Este repositório contém a implementação de **4 testes unitários automatizados** relacionados ao contexto do projeto **LegTech / Gestão de Pátios da Mottu**, utilizando **Java 17**, **JUnit 5** e **Maven**.

O objetivo é validar regras essenciais do sistema, garantindo consistência nas operações de cadastro, movimentação e leitura de dados vinculados às motos e suas zonas dentro dos pátios.

---

## ✅ Tecnologias Utilizadas

* **Java 17**
* **Maven 3.9+**
* **JUnit 5 (Jupiter)**
* **AssertJ (Assertions fluent API)**
* **Surefire Plugin (execução dos testes)**

---

## 📁 Estrutura do Projeto

Padrão Maven:

```
legtech-junit-simple/
├─ pom.xml
├─ src/
   ├─ main/java/br/com/mottu/legtech/
   │  ├─ CapacityService.java
   │  ├─ PlateValidator.java
   │  ├─ RfidTagValidator.java
   │  └─ StatusService.java
   └─ test/java/br/com/mottu/legtech/
      ├─ CapacityServiceTest.java
      ├─ PlateValidatorTest.java
      ├─ RfidTagValidatorTest.java
      └─ StatusServiceTest.java
```

---

## 🧪 Testes Implementados

Foram desenvolvidos **4 testes unitários**, todos relacionados diretamente ao contexto da aplicação:

### ✅ 1. `PlateValidatorTest`

Valida se uma placa está no padrão **Mercosul** (`ABC1D23`).

* Garante integridade no cadastro de motos.
* Verifica formatos válidos e inválidos.

---

### ✅ 2. `CapacityServiceTest`

Verifica se uma **zona pode ter sua capacidade configurada** dentro do limite do pátio.

* Regra: `capacidadeZona ≤ capacidadePatio`.

---

### ✅ 3. `StatusServiceTest`

Valida mudanças de status da moto.

* Regra: status `em_manutencao` **exige obrigatoriamente** uma `zonaId`.
* Lança exceção se a regra for violada.

---

### ✅ 4. `RfidTagValidatorTest`

Valida o padrão da **tag RFID operacional** (`TAG-9001`).

* Aceita minúsculas/maiúsculas.
* Rejeita caracteres fora do padrão.

---

## ▶️ Como Executar os Testes

1. Certifique-se de ter o **Maven** instalado:

   ```bash
   mvn -v
   ```

2. Execute todos os testes:

   ```bash
   mvn test
   ```

3. Resultado esperado:

   ```
   BUILD SUCCESS
   Tests run: 4, Failures: 0, Errors: 0
   ```

---

## 📊 Relatórios dos Testes

Após a execução, os relatórios ficam disponíveis em:

```
target/surefire-reports/
```

Arquivos gerados (um para cada classe de teste):

* `PlateValidatorTest.txt`
* `CapacityServiceTest.txt`
* `RfidTagValidatorTest.txt`
* `StatusServiceTest.txt`

Eles mostram:

* Quantidade de testes rodados
* Falhas / Erros
* Tempo de execução

---

## 📦 Dependências Principais (pom.xml)

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.assertj</groupId>
        <artifactId>assertj-core</artifactId>
        <version>3.25.3</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---
