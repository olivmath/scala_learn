Antes de começarmos vamos montar um ambiente **SIMPLES** pra isso vamos utilizar algumas ferramentas

Você tbm pode instalar usando o bash-script usando:

```
./install_prereq.sh
```
 

**[Instalar jdk-8](https://openjdk.java.net/install/)**

**[Instalar Sbt](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html)**

**[Instalar Scala](https://www.scala-lang.org/download/)**

**[Instalar SublimeText3](https://www.sublimetext.com/3/)**

**Instalar Terminus**
- Abrir SublimeText3 -> **ctrl + shift + p**
- pesquisar: Package Control: **Install Package**
- depois busque por: **Terminus**
- Configurar em: Preferences -> Package -> Settings -> Terminus Key Bindings
- Adicione ao aquivo:

```
{"keys": ["alt+1"], "command": "toggle_terminus_panel"},
{"keys": ["alt+2"], "command": "focus_group", "args": {"group": 0}}
```

**Como executar Scripts**

1. Abra o **SublimeText3** na pasta do repositório
2. **alt + 2** para abrir o **Teminus**
3. Depois: `sbt` e tenha pacienciência
4. Dentro do `sbt` rode: `run` e seu script será executado
- [Obs]
Caso haja mais de um script o **sbt** lhe perguntará qual deve ser executado
