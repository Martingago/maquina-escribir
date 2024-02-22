# Language
[ESP](readme.md)

# Infinite Monkey Theorem

"Give a monkey a typewriter and infinite time, at some point it will write a Shakespeare novel"

This JAVA program simulates the well-known infinite monkey theorem, with some adaptations to simplify the process:

- Only the 27 characters of the Spanish alphabet in lowercase are generated (Excluded: numbers, punctuation marks, accents, and special characters).
- The words that are generated will be the same size as the target word.
- The program operates sequentially, staying on a specific word until it is discovered. Once discovered, the program moves on to the next word, continuing this process until the entire text string is completed.

The program operates on a predefined text located in `src/FICHERO_ANALIZAR/Fichero_analizar.java` and executes a Producer/Consumer design pattern. It initializes three producer threads that generate random words and three consumer threads responsible for validating them until the target word is found. All of this is managed by a director class: `src/model/main/DirectorAlgoritmoBusquedaPalabras.java`, which is responsible for managing all the words that need to be generated, as well as obtaining the necessary general information for the correct operation of the program.


## Requirements

- Java JDK 20

## Program Execution

To run the program, follow these steps:

1. Navigate to the `build/classes/` folder.
2. Inside the `build/classes/` folder, open a terminal and run the following command:

```bash
java main/Main_Maquina_escribir
```

## Version History

V1.0: First version of the application:
- Performs within the class: `src/FICHERO_ANALIZAR/Fichero_analizar.java` a text extraction to execute the main thread of the program.
- Automatic saving of discovered words [date, time, necessary attempts to be discovered] every time a word is discovered and another automatic saving every 2 minutes.
- Saving of program execution statistics [Total execution time, number of total words generated, word statistics].
- Emulation of words that are being generated.
- Possibility to pause/resume the program.

## Linkedin

https://www.linkedin.com/in/martin-gago-choren/
