# Grooviza - Java Music Player

## Project Overview
Grooviza is a collaborative project developed by a group of students at DHA Suffa University for their Data Structures and Algorithms (DSA) course. it is a Java-based music player designed to play music from both the Spotify API (Online) and your Local Music Library (Offline). Leveraging data structures like LinkedList and Stack for managing playlists and history, Grooviza provides a customizable and personalized music playback experience. The player features a Theme Manager allowing users to change the player's skin, including uploading custom images for a personalized theme. With a sleek design and user-friendly controls, Grooviza serves as an alternative to default music players with cross-platform compatibility.

For documentation of the source code, visit [Source Code's JavaDoc](https://krystaldevv.github.io/grooviza/)

Contributors:

- **[Talha Nizamani](https://github.com/krystaldevv/)**
  - Role: Spotify API Integration & GitHub Maintainence
- **[Liza Khawaja](https://github.com/lizakhawaja/)**
  - Role: Local Music Library Implementation & Main Player's Playback Control
- **[Iqra Arif](https://github.com/iqra-arif09/)**
  - Role: Data Structures and Algorithms Implementation & UML
- **[Muhammad Anas]()**
  - Project Representative


### Key Features
- Spotify API integration for online music playback
- Local Music Library support for offline playback
- Customizable themes with user-uploaded images
- Playlist management using data structures (LinkedList, Stack, Queue)
- Playback controls (Shuffle, Previous, Play/Pause, Next, Repeat)
- Volume control slider
- User-friendly graphical interface with a splash screen, main player, and playlist panel

## Installation Instructions
### Prerequisites
- Java 21
- JavaZoom Layer Library
- SpotifyAPI Library (included in the GitHub repository)

### Installation Steps
1. Clone the repository: `https://github.com/krystaldevv/grooviza.git`
2. Open NetBeans, go to Teams > Git > Clone, and paste the repository URL.
3. Open `Main.java` and run the file.
4. The program should start normally.

**Additional Installation Options:**
- Alternatively, you can download the executable file from the GitHub releases on the repository. Execute the JAR file for quick installation.
- For manual compilation, follow the steps above using NetBeans with Ant.

## Usage Guide
### Interaction
Grooviza is a Graphical User Interface-based program with intuitive buttons for easy navigation.

### Configuration
- The program comes with default settings and runs out of the box.
- Users can define their music folder path.
- The program creates a "Music" folder at ```C:\Users\YourName\AppData\Roaming\63Player\Music```.
  
**Note:** _When running the program for the first time, ensure that you populate the newly created "Music" folder with your desired songs. The player relies on the contents of this folder for initial song loading._ 

## Configuration

### Customization
Users can customize:
- Themes for a personalized appearance.
- Music folder path according to their preferences.

### Configuration Process
1. Use the program's settings interface.
2. Manually edit configuration files.

## Contributing Guidelines
- Contributions are welcome for improving workflow, design, icons, and code logic.
- Report bugs and contribute to the project by forking and submitting pull requests.

### Contribution Types
- Code contributions
- Bug reports
- Documentation improvements

### Coding Standards
- Code should be well-commented and not obfuscated.
- Follow camel case for variable and function names.
- Maintain proper indentation and include exception handling.

## License

For any issues or inquiries, please contact the project maintainers. Enjoy the music with Grooviza!
