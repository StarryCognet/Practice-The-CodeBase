// minesweeper.js
const BOARD_SIZE = 20; // 10x10 的棋盘
const NUM_MINES = 20;  // 10 个地雷

let board = [];
let mines = [];

// 初始化棋盘
function initBoard() {
    const boardElement = document.getElementById('board');
    boardElement.innerHTML = '';
    boardElement.style.gridTemplateColumns = `repeat(${BOARD_SIZE}, 30px)`;

    for (let row = 0; row < BOARD_SIZE; row++) {
        board[row] = [];
        for (let col = 0; col < BOARD_SIZE; col++) {
            const cell = document.createElement('div');
            cell.classList.add('cell');
            cell.dataset.row = row;
            cell.dataset.col = col;
            cell.addEventListener('click', handleCellClick);
            boardElement.appendChild(cell);
            board[row][col] = { isMine: false, revealed: false, count: 0 };
        }
    }
}

// 随机放置地雷
function placeMines() {
    mines = [];
    while (mines.length < NUM_MINES) {
        const row = Math.floor(Math.random() * BOARD_SIZE);
        const col = Math.floor(Math.random() * BOARD_SIZE);
        if (!board[row][col].isMine) {
            board[row][col].isMine = true;
            mines.push({ row, col });
        }
    }
}

// 计算每个格子周围的地雷数量
function calculateCounts() {
    for (let row = 0; row < BOARD_SIZE; row++) {
        for (let col = 0; col < BOARD_SIZE; col++) {
            if (!board[row][col].isMine) {
                let count = 0;
                for (let i = -1; i <= 1; i++) {
                    for (let j = -1; j <= 1; j++) {
                        const newRow = row + i;
                        const newCol = col + j;
                        if (newRow >= 0 && newRow < BOARD_SIZE && newCol >= 0 && newCol < BOARD_SIZE && board[newRow][newCol].isMine) {
                            count++;
                        }
                    }
                }
                board[row][col].count = count;
            }
        }
    }
}

// 处理格子点击事件
function handleCellClick(event) {
    const row = parseInt(event.target.dataset.row);
    const col = parseInt(event.target.dataset.col);
    const cell = board[row][col];

    if (cell.revealed) return;

    cell.revealed = true;
    event.target.classList.add('revealed');

    if (cell.isMine) {
        event.target.classList.add('mine');
        event.target.textContent = '💣';
        alert('游戏结束！你踩到地雷了！');
        revealAllMines();
    } else {
        event.target.textContent = cell.count || '';
        if (cell.count === 0) {
            revealNeighbors(row, col);
        }
        checkWin();
    }
}

// 递归揭示周围的格子
function revealNeighbors(row, col) {
    for (let i = -1; i <= 1; i++) {
        for (let j = -1; j <= 1; j++) {
            const newRow = row + i;
            const newCol = col + j;
            if (newRow >= 0 && newRow < BOARD_SIZE && newCol >= 0 && newCol < BOARD_SIZE && !board[newRow][newCol].revealed) {
                const cell = document.querySelector(`.cell[data-row="${newRow}"][data-col="${newCol}"]`);
                cell.click();
            }
        }
    }
}

// 检查是否胜利
function checkWin() {
    let unrevealedCount = 0;
    for (let row = 0; row < BOARD_SIZE; row++) {
        for (let col = 0; col < BOARD_SIZE; col++) {
            if (!board[row][col].revealed && !board[row][col].isMine) {
                unrevealedCount++;
            }
        }
    }
    if (unrevealedCount === 0) {
        alert('恭喜你，你赢了！');
    }
}

// 揭示所有地雷
function revealAllMines() {
    mines.forEach(mine => {
        const cell = document.querySelector(`.cell[data-row="${mine.row}"][data-col="${mine.col}"]`);
        cell.classList.add('mine');
        cell.textContent = '💣';
    });
}

// 初始化游戏
function initGame() {
    initBoard();
    placeMines();
    calculateCounts();
}

// 启动游戏
initGame();