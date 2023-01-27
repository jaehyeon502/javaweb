package service;

import java.util.List;

import database.DAO.BoardDAO;
import database.DAO.UserDAO;
import database.Entity.BoardEntity;
import database.Entity.UserEntity;
import dto.DeleteBoardDTO;
import dto.InsertBoardDTO;
import dto.UpdateBoardDTO;

// 실제 비즈니스 로직을 수행하는 Layer
public class BoardService {
	// 인스턴스 선언만!
	private BoardDAO boardDao;
	private UserDAO userDao;
	
	public BoardService() {
		// 인스턴스를 생성할때 초기화 될수있도록 생성자안에서 초기화작업!
		this.boardDao = new BoardDAO();
		this.userDao = new UserDAO();
	}
	
	public int postBoard(InsertBoardDTO insertBoardDto) {
		
		UserEntity userEntity = userDao.findById(insertBoardDto.getBoardWriter());
		if (userEntity == null) return 0;
		
		return boardDao.insert(insertBoardDto);
		
	}//postBoard end
	
	public List<BoardEntity> getBoardList() {
		return boardDao.find();
	}//getBoardList end
	
	public int patchBoard(UpdateBoardDTO updateBoardDto) {
		Integer id = updateBoardDto.getId();
		// 존재하는 Board id 인지 검증
		BoardEntity boardEntity = boardDao.findById(id);
		if (boardEntity == null) return -1;
					
		return boardDao.update(updateBoardDto);
	}// patchBoard end
	
	public int deleteBoard(DeleteBoardDTO deleteBoardDto) {
		return boardDao.delete(deleteBoardDto);
	}// deleteBoard end
}
