CC = g++
CFLAGS = -std=c++20 -Wall
SRCS := $(wildcard src/*.cpp)

OBJS := $(patsubst src/%.cpp, bin/%.out, $(SRCS))

all: $(OBJS)

bin/%.out: src/%.cpp
	$(CC) $(CFLAGS) $< -o $@

clean:
	rm -f $(OBJS)	
