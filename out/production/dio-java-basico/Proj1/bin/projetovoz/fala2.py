from gtts import gTTS
import pygame
import sys

def falar(texto):
    tts = gTTS(texto, lang='pt')
    tts.save("fala.mp3")

    pygame.mixer.init()
    pygame.mixer.music.load("fala.mp3")
    pygame.mixer.music.play()
    while pygame.mixer.music.get_busy():
        pygame.time.Clock().tick(10)

if __name__ == "__main__":
    texto = ' '.join(sys.argv[1:])
    falar(texto)
