import { useNavigate } from 'react-router-dom';

import { Avatar, Box, Card, CardActionArea, Typography } from '@mui/material'

import { GetTop3ListResponseDto } from 'src/apis/response/board';

interface Props {
    previewItem: GetTop3ListResponseDto;
}

export default function PreViewCard({ previewItem }: Props) {

    //          Hook          //
    const navigator = useNavigate();
    
    const backgroundImage = `url(${previewItem.boardImgUrl})`;

    return (
        <Card>
            <CardActionArea sx={{ height: '508px', backgroundImage: backgroundImage, backgroundRepeat: 'no-repeat', backgroundSize: '100% 100%' }} onClick={() => navigator(`/board/detail/${previewItem.boardNumber}`)}>
                <Box sx={{ height: '100%', display: 'flex', flexDirection: 'column-reverse' }}>
                    <Box sx={{ p: '24px' }}>
                        <Box sx={{ display: 'flex' }}>
                            <Box sx={{ mr: '8px' }}>
                                <Avatar alt="Remy Sharp" src={previewItem.writerProfileUrl ? previewItem.writerProfileUrl : ''} />
                            </Box>
                            <Box>
                                <Typography sx={{ fontSize: '12px', fontWeight: '500', color: '#666' }}>{previewItem.writerNickname}</Typography>
                                <Typography sx={{ mt: '2px', fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>{previewItem.boardWriteDatetime}</Typography>
                            </Box>
                        </Box>
                        <Box sx={{ mt: '16px', mb: '16px' }}>
                            <Typography sx={{ fontSize: '16px', fontWeight: '500', color: '#666' }}>{previewItem.boardTitle}</Typography>
                            <Typography sx={{ mt: '5px', fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>{previewItem.boardContent}</Typography>
                        </Box>
                        <Box>
                            <Typography sx={{ fontSize: '12px', fontWeight: '400', color: 'rgba(0,0,0,0.5)' }}>{`댓글 ${previewItem.commentCount} · 좋아요 ${previewItem.likeCount} · 조회수 ${previewItem.viewCount}`}</Typography>
                        </Box>
                    </Box>
                </Box>
            </CardActionArea>

        </Card>
    )
}
