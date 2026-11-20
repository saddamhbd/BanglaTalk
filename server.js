const express = require('express'); const http = require('http'); const { Server } = require('socket.io');
const app = express(); const server = http.createServer(app); const io = new Server(server, { cors: { origin: '*' } });
app.get('/', (_req,res) => res.send('Bangla Talk signaling prototype is running'));
io.on('connection', socket => { socket.on('join-call', room => socket.join(String(room))); for (const event of ['offer','answer','ice-candidate','hangup']) socket.on(event, data => socket.to(String(data.room)).emit(event,data)); });
server.listen(process.env.PORT || 3000);
