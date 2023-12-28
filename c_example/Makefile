

CC=gcc
CFLAGS=-Wall -Iinclude --static
TARGET=executable

SRCS=src/a.c src/b.c

ADD_FLAG=-DADD


OBJS=$(SRCS:.c=.o)

all: $(TARGET)

$(TARGET): $(OBJS)
	$(CC) -o $(TARGET) $(OBJS)

 
%.o: %.c
	$(CC) $(CFLAGS) $(ADD_FLAG) -c $< -o $@

clean:
	rm -f $(TARGET) $(OBJS)
 
