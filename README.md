# Java TCP Client–Server

A university **team networking project** developed in Java to explore TCP socket communication, client-server architecture, and bidirectional messaging.

The project was developed through multiple milestones, starting with basic TCP communication and progressing to interactive communication between network endpoints.

---

## Project Overview

The application demonstrates communication between a TCP client and server using Java socket programming.

The project explores:

- TCP client-server communication
- Java socket programming
- IPv4-based connections
- Input and output streams
- Bidirectional messaging
- Multithreading for receiving messages

---

## Project Structure

```text
java-tcp-client-server/
│
├── milestone-1/
│   ├── TCPClient.java
│   └── TCPServer.java
│
├── milestone-2/
│   ├── TCPClient.java
│   └── TCPServer.java
│
├── milestone-3/
│   ├── README.md
│   └── screenshots/
│
└── README.md
```

---

## Milestone 1 — Basic TCP Communication

The first milestone focuses on establishing basic communication between a TCP client and server.

The client establishes a connection with the server, sends a message, and receives a response.

The server listens for incoming connections, receives the client's message, processes it, and sends the result back.

### Concepts

`Socket` `ServerSocket` `BufferedReader` `DataOutputStream` `TCP`

---

## Milestone 2 — Bidirectional Communication

The second milestone extends the application to support interactive communication between the client and server.

The client connects to the server using an IPv4 address and TCP port.

A separate Java thread handles incoming messages while the main execution flow remains available for sending messages.

### Concepts

`TCP/IP` `Sockets` `Threads` `BufferedReader` `PrintWriter` `IPv4`

---

## Milestone 3 — Testing & Results

The final milestone documents the testing and communication process through screenshots captured while running the application.

The screenshots demonstrate the interaction between the client and server during testing.

See the [`milestone-3`](./milestone-3) folder for the original project screenshots.

---

## Technologies

| Technology | Usage |
|---|---|
| Java | Application development |
| TCP/IP | Network communication |
| Java Sockets | Client-server connections |
| Threads | Concurrent message reception |
| Eclipse IDE | Development and testing |

---

## What I Learned

Through my participation in this project, I gained practical experience with:

- TCP/IP communication
- Java socket programming
- Client-server architecture
- Sending and receiving data through network streams
- Working with `Socket` and `ServerSocket`
- Using Java threads for interactive communication
- Testing and debugging network applications
- Collaborative development in a team environment

---

## Academic Context

This project was developed as a **team project** as part of university coursework at the **German University in Cairo (GUC)**.

**Project Grade: 95/100**

The repository documents the project's original source code, milestones, and testing results.

---

## My Contribution

I contributed to the development and testing of the project as a member of the team.

---

## Student

**Sama Ismael**  
Information Engineering & Technology  
German University in Cairo
