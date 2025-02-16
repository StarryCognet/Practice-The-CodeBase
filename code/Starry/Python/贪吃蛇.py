import pygame
import random
import time

# 初始化
pygame.init()
WIDTH, HEIGHT = 600, 400
win = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("贪吃蛇")

# 颜色定义
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)

# 蛇类
class Snake:
    def __init__(self):
        self.body = [[100, 50], [90, 50], [80, 50]]
        self.direction = "RIGHT"
        self.speed = 15

    def move(self):
        head = self.body[0].copy()
        
        if self.direction == "RIGHT":
            head[0] += 10
        elif self.direction == "LEFT":
            head[0] -= 10
        elif self.direction == "UP":
            head[1] -= 10
        elif self.direction == "DOWN":
            head[1] += 10
            
        self.body.insert(0, head)
        self.body.pop()

# 食物类
class Food:
    def __init__(self):
        self.position = [random.randrange(1, (WIDTH//10)) * 10, 
                        random.randrange(1, (HEIGHT//10)) * 10]
    
    def respawn(self):
        self.position = [random.randrange(1, (WIDTH//10)) * 10,
                        random.randrange(1, (HEIGHT//10)) * 10]

# 游戏主逻辑
def main():
    snake = Snake()
    food = Food()
    score = 0
    clock = pygame.time.Clock()
    
    running = True
    while running:
        # 事件处理
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_RIGHT and snake.direction != "LEFT":
                    snake.direction = "RIGHT"
                elif event.key == pygame.K_LEFT and snake.direction != "RIGHT":
                    snake.direction = "LEFT"
                elif event.key == pygame.K_UP and snake.direction != "DOWN":
                    snake.direction = "UP"
                elif event.key == pygame.K_DOWN and snake.direction != "UP":
                    snake.direction = "DOWN"

        # 移动蛇
        snake.move()
        
        # 吃食物检测
        if snake.body[0][0] == food.position[0] and snake.body[0][1] == food.position[1]:
            snake.body.append(snake.body[-1])
            food.respawn()
            score += 10
            snake.speed += 0.5
        
        # 碰撞检测
        if (snake.body[0][0] >= WIDTH or snake.body[0][0] < 0 or
            snake.body[0][1] >= HEIGHT or snake.body[0][1] < 0):
            running = False
            
        for segment in snake.body[1:]:
            if snake.body[0] == segment:
                running = False

        # 绘制界面
        win.fill(BLACK)
        for pos in snake.body:
            pygame.draw.rect(win, GREEN, pygame.Rect(pos[0], pos[1], 10, 10))
        pygame.draw.rect(win, RED, pygame.Rect(food.position[0], food.position[1], 10, 10))
        
        # 显示分数
        font = pygame.font.SysFont(None, 30)
        text = font.render(f"Score: {score}", True, WHITE)
        win.blit(text, (10, 10))
        
        pygame.display.flip()
        clock.tick(snake.speed)
        
    pygame.quit()

if __name__ == "__main__":
    main()
